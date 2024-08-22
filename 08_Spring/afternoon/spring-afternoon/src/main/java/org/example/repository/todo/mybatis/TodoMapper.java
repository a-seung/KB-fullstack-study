package org.example.repository.todo.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.domain.TodoMybatis;

import java.util.List;

@Mapper
public interface TodoMapper {
    public List<TodoMybatis> findAll();
    public TodoMybatis findById(@Param("id")Long id);
    public int addTodo(TodoMybatis newTodo);
    public int toggleDone(TodoMybatis newTodo);
    public int updateTodo(TodoMybatis newTodo);
    public int deleteTodo(@Param("id")Long id);
}
