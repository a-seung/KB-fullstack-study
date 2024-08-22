package org.example.controller.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.Todo;
import org.example.repository.todo.jpa.JpaTodoRepository;
import org.example.repository.todo.mybatis.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@Transactional
@CrossOrigin(origins = "*")
@RequestMapping("/todo/jpa")
public class JpaTodoController {

    private final JpaTodoRepository jpaTodoRepository;
    private final TodoRepository todoRepository;

    // 전체 todo 조회
    @GetMapping("")
    public ResponseEntity<List<Todo>> findAll() {
        List<Todo> todoList = jpaTodoRepository.findAll();
        log.info("==============> 모든 todo 조회 성공");

        return ResponseEntity.ok(todoList);
    }

    // 특정 todo 조회
    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id) {
        Todo findTodo = jpaTodoRepository.findById(id);
        log.info("==============> 특정 id todo 조회 성공");

        if (findTodo == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(findTodo);
    }

    // todo 생성
    @PostMapping("/{todo}")
    public ResponseEntity<Todo> addTodo(@PathVariable("todo") String todo) {
        Todo newTodo = new Todo(null, todo, false);
        Todo addedTodo = jpaTodoRepository.addTodo(newTodo);
        if (addedTodo == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(addedTodo);
    }

    // todo 완료 토글
    @PutMapping("/{id}")


    // todo 수정
//    @PutMapping("/update/{id}/{todo}")
//
//


    @DeleteMapping(value = "/{id}", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        Todo findTodo = jpaTodoRepository.findById(id);
        if (findTodo == null) return ResponseEntity.notFound().build();

        jpaTodoRepository.deleteTodo(id);
        log.info("==============> todo 삭제 성공");
        return ResponseEntity.ok("삭제 성공");
    }
}
