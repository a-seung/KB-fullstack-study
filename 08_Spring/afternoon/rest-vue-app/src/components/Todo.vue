<template>
  <div class="container">
    <div class="todo-board">
      <h1>Todo</h1>
      <div class="add-todo">
        <input
          v-model="newTodo"
          @keyup.enter="addTodo"
          placeholder="새로운 할 일을 입력하세요"
        />
        <button @click="addTodo" class="add-btn">추가</button>
      </div>
      <div v-if="error" class="error">{{ error }}</div>
      <div v-else>
        <ul class="todo-list" v-if="todos.length > 0">
          <li
            v-for="todo in todos"
            :key="todo.id"
            class="todo-item"
            :class="{ completed: todo.done }"
          >
            <div v-if="editingId === todo.id" class="edit-mode">
              <input v-model="editingText" @keyup.enter="updateTodo(todo.id)" />
              <button @click="updateTodo(todo.id)" class="save-btn">
                저장
              </button>
              <button @click="cancelEdit" class="cancel-btn">취소</button>
            </div>
            <div v-else class="todo-content">
              <div class="todo-info">
                <h3 class="todo-title">{{ todo.todo }}</h3>
                <span v-if="todo.done" class="completed-icon">✔️</span>
              </div>
              <div class="todo-actions">
                <button @click="toggleDone(todo)" class="complete-btn">
                  {{ todo.done ? '미완료' : '완료' }}
                </button>
                <button @click="startEdit(todo)" class="edit-btn">수정</button>
                <button @click="deleteTodo(todo.id)" class="delete-btn">
                  삭제
                </button>
              </div>
            </div>
          </li>
        </ul>
        <div v-else class="no-todos">지금은 데이터를 받아오지 못했습니다</div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { onMounted, ref, nextTick } from 'vue';
import axios from 'axios';

const todos = ref([]);
const loading = ref(false);
const error = ref(null);
const url = 'http://localhost:8080/todo';

const newTodo = ref('');
const editingId = ref(null);
const editingText = ref('');

onMounted(fetchTodos);

async function fetchTodos() {
  loading.value = true;
  error.value = null;
  try {
    const response = await axios.get(url);
    console.log('Todo 리스트 받기 :', response.data);
    todos.value = response.data;
  } catch (err) {
    error.value = 'Todo 리스트 받기 실패';
    console.error('Todo 리스트 받기 실패 :', err);
  } finally {
    loading.value = false;
  }
}

async function addTodo() {
  if (!newTodo.value.trim()) return;
  try {
    const response = await axios.post(`${url}/${newTodo.value}`);
    console.log('Todo 추가 :', response.data);
    newTodo.value = '';
    fetchTodos();
  } catch (err) {
    error.value = 'Todo 추가 실패';
    console.error('Todo 추가 실패 :', err);
  }
}

function startEdit(todo) {
  editingId.value = todo.id;
  editingText.value = todo.todo;
}

function cancelEdit() {
  editingId.value = null;
  editingText.value = '';
}

async function updateTodo(id) {
  try {
    const response = await axios.put(
      `${url}/update/${id}/${editingText.value}`
    );
    console.log('Todo 수정 :', response.data);
    cancelEdit();
    fetchTodos();
  } catch (err) {
    error.value = 'Todo 수정 실패';
    console.error('Todo 수정 실패 :', err);
  }
}

async function deleteTodo(id) {
  try {
    await axios.delete(`${url}/${id}`);
    console.log('Todo 삭제 id :', id);
    fetchTodos();
  } catch (err) {
    error.value = 'Todo 삭제 실패';
    console.error('Todo 삭제 실패:', err);
  }
}

async function toggleDone(todo) {
  try {
    const response = await axios.put(`${url}/${todo.id}`);
    console.log('Todo 완료 수정 :', response.data);
    fetchTodos();
  } catch (err) {
    error.value = 'Todo 완료 수정 실패';
    console.error('Todo 완료 수정 실패:', err);
  }
}
</script>

<style scoped>
.container {
  width: 300px;
  margin: 0 auto;
  padding: 20px;
}

.todo-board {
  background-color: #f9f9f9;
  padding: 20px;
  border-radius: 10px;
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
}

h1 {
  text-align: center;
  color: #333;
  font-size: 2rem;
  margin-bottom: 20px;
}

.add-todo {
  display: flex;
  justify-content: space-between;
  margin-bottom: 20px;
}

.add-todo input {
  flex: 1;
  padding: 10px;
  border-radius: 5px;
  border: 1px solid #ddd;
  margin-right: 10px;
  font-size: 16px;
}

.add-btn {
  background-color: #4caf50;
  color: white;
  padding: 10px 15px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

.load-button {
  display: block;
  width: 100%;
  background-color: #2196f3;
  color: white;
  padding: 10px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  margin-bottom: 20px;
}

.todo-list {
  list-style: none;
  padding: 0;
}

.todo-item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 15px;
  margin-bottom: 10px;
  background-color: white;
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

.todo-content {
  width: 100%;
  display: flex;
  justify-content: space-between;
}

.todo-info {
  display: flex;
  align-items: center;
}

.todo-title {
  margin: 0;
  font-size: 18px;
  font-weight: normal;
}

.completed-icon {
  margin-left: 10px;
  font-size: 18px;
  color: green;
}

.todo-actions {
  display: flex;
}

.todo-actions button {
  margin-left: 10px;
  padding: 8px 12px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 14px;
}

.complete-btn {
  background-color: #f0ad4e;
  color: white;
}

.edit-btn {
  background-color: #5bc0de;
  color: white;
}

.delete-btn {
  background-color: #d9534f;
  color: white;
}

.todo-item.completed .todo-title {
  text-decoration: line-through;
  color: #888;
}

.no-todos {
  text-align: center;
  font-size: 16px;
  color: #999;
}
</style>
