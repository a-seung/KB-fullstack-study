package org.example.repository.todo.mybatis;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.example.domain.todo.TodoMybatis;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TodoRepository {
    private final TodoMapper todoMapper;

    public List<TodoMybatis> findAll() {
        return todoMapper.findAll();
    }

    public TodoMybatis findById(@Param("id") Long id) {
        return todoMapper.findById(id);
    }

    public int addTodo(TodoMybatis newTodo) {
        return todoMapper.addTodo(newTodo);
    }

    public int updateTodo(TodoMybatis newTodo) {
        return todoMapper.updateTodo(newTodo);
    }

    public int toggleDone(TodoMybatis newTodo) {
        return todoMapper.toggleDone(newTodo);
    }

    public int deleteTodo(@Param("id") Long id) {
        return todoMapper.deleteTodo(id);
    }
}
