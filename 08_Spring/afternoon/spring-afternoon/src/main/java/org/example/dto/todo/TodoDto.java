package org.example.dto.todo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // getter,setter 대신

@AllArgsConstructor // constructor 대신
public class TodoDto {
    private String todo;

//    public TodoDto(String todo) {
//        this.todo = todo;
//    }
//
//    public String getTodo() {
//        return todo;
//    }
//
//    public void setTodo(String todo) {
//        this.todo = todo;
//    }
}
