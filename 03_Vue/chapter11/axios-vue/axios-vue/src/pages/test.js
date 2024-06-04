const todo = {
  id: '1',
  todo: '오브젝트 이해하기',
  done: false,
};

const copyTodo = {
  id: todo.id,
  todo: todo.todo,
  done: true,
};

console.log(todo === copyTodo);
console.log(copyTodo);

// 객체가 100000개면 그중 한개 변경할때 불편함=> ...펼침연산자 이용하면됨
