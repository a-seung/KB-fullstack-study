package org.example.repository.todo.jpa;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.todo.Todo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Slf4j
@RequiredArgsConstructor
@Transactional
public class JpaTodoRepository {
    private final EntityManager em;

    //게시글 조회
    public List<Todo> findAll() {
        String jpql = "SELECT t FROM Todo t";
        List<Todo> todoList = em.createQuery(jpql, Todo.class).getResultList();
        return todoList;
    }

    //특정 게시글 조회
    public Todo findById(@PathVariable("id") Long id) {
        return em.find(Todo.class, id);
    }

    // Todo 추가 하기
    public Todo addTodo(Todo newTodo) {
        em.persist(newTodo);
        return newTodo;
    }

    // 완료 변경하기
    public Todo toggleDone(Long id) {
        Todo existingTodo = em.find(Todo.class, id);
        if(existingTodo != null) {
            existingTodo.setDone(!existingTodo.isDone());
        }
        return existingTodo;
    }

    // 수정하기
    public Todo updateTodo(Long id, String newTodo) {
        Todo existingTodo = em.find(Todo.class, id);
        if(existingTodo != null) {
            existingTodo.setTodo(newTodo);
            em.merge(existingTodo);
        }
        return existingTodo;
    }

    // 삭제하기
    public void deleteTodo(Long id) {
        Todo todo = em.find(Todo.class, id);
        if (todo != null) em.remove(todo);
    }
}
