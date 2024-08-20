package org.example.controller.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.Todo;
import org.example.repository.todo.jpa.JpaTodoRepository;
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
@RequestMapping("/todo")
public class JpaTodoController {

    private final JpaTodoRepository jpaTodoRepository;

    @GetMapping("")
    public ResponseEntity<List<Todo>> findAll() {
        List<Todo> todoList = jpaTodoRepository.findAll();
        log.info("==============> 모든 todo 조회 성공");

        return ResponseEntity.ok(todoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id) {
        Todo findTodo = jpaTodoRepository.findById(id);
        log.info("==============> 특정 id todo 조회 성공");

        if (findTodo == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(findTodo);
    }

    @PostMapping("/{todo}")
    public ResponseEntity<Todo> addTodo(@PathVariable("todo") String todo) {
        log.info("==============> todo 추가 성공");
        Todo newTodo = new Todo(null, todo, false);
        Todo addedTodo = jpaTodoRepository.addTodo(newTodo);

        if (addedTodo == null) return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
    }


    // 완료설정

    // 수정

    // 삭제
    @DeleteMapping(value = "/{id}", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<Todo> deleteTodo(@PathVariable("id") Long id) {
        Todo deleteTodo = jpaTodoRepository.findById(id);
        if(deleteTodo == null) return ResponseEntity.notFound().build();

        jpaTodoRepository.delete(id);
        return ResponseEntity.ok(deleteTodo);
    }

}
