package org.example.controller.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.todo.TodoMybatis;
import org.example.repository.todo.mybatis.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/todo/mybatis")
public class MybatisTodoController {
    private final TodoRepository todoRepository;

    // 전체 todo 조회
    @GetMapping("")
    public ResponseEntity<List<TodoMybatis>> findAll() {
        List<TodoMybatis> todoList = todoRepository.findAll();
        log.info("=========> 전체 todo 조회 성공");
        return ResponseEntity.ok(todoList);
    }

    // 특정 todo 조회
    @GetMapping("/{id}")
    public ResponseEntity<TodoMybatis> findById(@PathVariable Long id) {
        TodoMybatis findList = todoRepository.findById(id);
        if (findList == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(findList);
    }

    // todo 생성
    @PostMapping("/{todo}")
    public ResponseEntity<TodoMybatis> addTodo(@PathVariable("todo") String todo) {
        TodoMybatis newTodo = new TodoMybatis(null, todo, false);
        int affectedRows = todoRepository.addTodo(newTodo);

        if (affectedRows == 0) return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
    }

    // todo 완료 토글
    @PutMapping("/{id}")
    public ResponseEntity<TodoMybatis> toggleDone(@PathVariable Long id) {
        TodoMybatis newTodo = todoRepository.findById(id);
        newTodo.setDone(!newTodo.isDone());
        todoRepository.toggleDone(newTodo);

        return ResponseEntity.ok(newTodo);
    }

    // todo 수정
    @PutMapping("/update/{id}/{todo}")
    public ResponseEntity<TodoMybatis> updateTodo(
            @PathVariable("id") Long id,
            @PathVariable("todo") String todo) {
        TodoMybatis newTodo = todoRepository.findById(id);
        newTodo.setTodo(todo);
        todoRepository.updateTodo(newTodo);

        return ResponseEntity.ok(newTodo);
    }

    // todo 삭제
    @DeleteMapping(value = "/{id}", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        int affectedRows = todoRepository.deleteTodo(id);

        if (affectedRows == 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("todo 삭제 실패");
        }
        return ResponseEntity.ok("Todo 삭제 성공");
    }
}
