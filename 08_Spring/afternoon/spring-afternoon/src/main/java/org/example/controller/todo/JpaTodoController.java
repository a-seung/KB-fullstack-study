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
        if (addedTodo == null) return ResponseEntity.internalServerError().build();
        log.info("==============> todo 생성 성공");
        return ResponseEntity.ok(addedTodo);
    }

    // todo 완료 토글
    @PutMapping("/{id}")
    public ResponseEntity<Todo> toggleDone(@PathVariable Long id) {
        Todo todoDone = jpaTodoRepository.findById(id);
        if (todoDone == null) return ResponseEntity.notFound().build();
        todoDone = jpaTodoRepository.toggleDone(id);
        log.info("==============> todo 토글 변경 성공");
        return ResponseEntity.ok(todoDone);
    }

    // todo 수정
    @PutMapping("/update/{id}/{todo}")
    public ResponseEntity<Todo> updateTodo(@PathVariable("id") Long id, @PathVariable("todo") String todo) {
        Todo updatedTodo = jpaTodoRepository.findById(id);
        if (updatedTodo == null) return ResponseEntity.notFound().build();
        updatedTodo = jpaTodoRepository.updateTodo(id, todo);
        log.info("==============> todo 수정 성공");
        return ResponseEntity.ok(updatedTodo);
    }

    @DeleteMapping(value = "/{id}", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        Todo findTodo = jpaTodoRepository.findById(id);
        if (findTodo == null) return ResponseEntity.notFound().build();

        jpaTodoRepository.deleteTodo(id);
        log.info("==============> todo 삭제 성공");
        return ResponseEntity.ok("삭제 성공");
    }
}
