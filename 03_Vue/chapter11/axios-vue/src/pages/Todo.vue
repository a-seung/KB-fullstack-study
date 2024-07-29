<template>
  <main>
    <div>
      <h1>Todo List</h1>
      <div>
        <input type="text" v-model.trim="todo" />
        <button @click="addTodo">추가</button>
      </div>
      <br />
      <!-- 리스트 파트 -->
      <ol>
        <!-- 투두 항목 -->
        <li v-for="todoItem in states.todoList" :key="todoItem.id">
          <span v-bind:style="todoItem.done ? { textDecoration: 'line-through' } : { textDecoration: 'none' }" @click="toggleTodo(todoItem.id)"
            >{{ todoItem.todo }} {{ todoItem.done ? '(완료)' : '' }}
          </span>
          <!-- 수정 모드 -->
          <div v-if="todoItem.editing">
            <input type="text" v-model.trim="todoEdit" />
            <button @click.stop="confirmEditTodo(todoItem.id)">확인</button>
            <button @click.stop="cancelEditTodo(todoItem.id)">취소</button>
          </div>
          &nbsp;
          <!-- 공백을 나타내는 코드 &nbsp -->
          <span v-if="!todoItem.editing">
            <button @click.stop="editTodo(todoItem.id)">수정</button>
            /
            <button @click.stop="deleteTodo(todoItem.id)">삭제</button>
            <!-- stop으로 버블링을 막음 -->
          </span>
        </li>
      </ol>
    </div>
  </main>
</template>

<script setup>
import axios from 'axios';
import { ref, reactive } from 'vue';

const states = reactive({
  todoList: [],
});
const todo = ref('');
const todoEdit = ref('');

// localhost:3000
const BASEURL = '/api/todos';

async function fetchTodoList() {
  try {
    const fetchTodoRes = await axios.get(BASEURL);
    // console.log(fetchTodoRes);
    states.todoList = fetchTodoRes.data;
    console.log(states.todoList);
  } catch (error) {
    alert('TodoList 데이터 통신 Err 발생'); //사용자를 위한 부분//
    console.log(error); //개발자를 위한 부분//
  }
}

async function addTodo() {
  // 예외 처리 먼저해주는 중 early return 처리를 하면 에러났을 때 한눈에 들어옴
  if (todo.value === '') return alert('할 일을 입력해 주세요!');
  try {
    const newTodo = { todo: todo.value, done: false };
    const addTodoRes = await axios.post(BASEURL, newTodo);

    if (addTodoRes.status !== 201) return alert('Todo 추가 실패');
    todo.value = ''; //초기화
    fetchTodoList();
  } catch (error) {
    alert('Todolist 추가 작업 중, ERR 발생');
    console.log(error);
  }
}

async function toggleTodo(id) {
  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    const payload = { ...targetTodo, done: !targetTodo.done };
    const toggleTodoRes = await axios.put(`${BASEURL}/${id}`, payload);

    if (toggleTodoRes.status !== 200) return alert('Todo toggle 실패');
    fetchTodoList();
  } catch (error) {
    alert('Todolist 토글 작업 중, ERR 발생');
    console.log(error);
  }
}

async function deleteTodo(id) {
  try {
    const delTodoRes = await axios.delete(`${BASEURL}/${id}`);
    //위에서 버튼 클릭 이벤트에 id를 받아오기로 했으니까 받아올 매개변수 이름은 다르게 해도됨
    // /api/todos/12 을 표현 => (BASEURL + `/${id}`) 로 써도됨
    if (delTodoRes.status !== 200) return alert('Todo 삭제 실패');
    // console.log(delTodoRes.status);
    fetchTodoList(); // 해줘야 바로바로 다시 그려줌
  } catch (error) {
    alert('Todolist  삭제 작업 중, ERR 발생');
    console.log(error);
  }
}

function editTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = true;
}

function cancelEditTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = false;
}

async function confirmEditTodo(id) {
  if (todoEdit.value === '') return alert('수정 내용을 입력하세요!');
  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    console.log(targetTodo);
    const payload = { ...targetTodo, todo: todoEdit.value, editing: false };
    const editTodoRes = await axios.put(`${BASEURL}/${id}`, payload);

    if (editTodoRes.status !== 200) return alert('Todo 수정 실패');
    fetchTodoList();
    todoEdit.value = '';
  } catch (error) {
    alert('수정 작업 중 ERR 발생');
    console.log(error);
  }
}

fetchTodoList();
</script>

<style scoped></style>
