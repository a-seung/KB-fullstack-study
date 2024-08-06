package org.example.controller.todo;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class TodoShowControllerV2 {
    private TodoDtoListV2 todoDtoList;

    @Autowired
    public TodoShowControllerV2(TodoDtoListV2 todoDtoList) {
        this.todoDtoList = todoDtoList;
    }

    @GetMapping("/todo/v2/show")
    public String process(HttpServletRequest request) {
        log.info("==============> TODO 목록 조회 페이지 호출, /todo/v2/show");

        request.setAttribute("todoDtoList", todoDtoList.getList());
        return "todo-show2";
    }
}
