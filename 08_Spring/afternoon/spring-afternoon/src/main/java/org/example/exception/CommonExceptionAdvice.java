package org.example.exception;

import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Arrays;

@ControllerAdvice //스프링 전역에서 사용할 수 있는 것을 빈에 등록
@Log4j
public class CommonExceptionAdvice {
    private String context = "/exception";

    @ExceptionHandler(NoHandlerFoundException.class) //특정 예외 발생하면 어떤 메서드를 호출 시킬지 정함
    @ResponseStatus(HttpStatus.NOT_FOUND) //응답 보낼 때 깃발 역할
    public String noHandle404(NoHandlerFoundException e) {
        return context + "/404";
    }

    @ExceptionHandler(Exception.class) // 예상치 못한 에러가 떴을 때 처리하는 방법
    public String exception(Exception e, Model model) {
        log.error(e.getMessage());
        e.printStackTrace();

        model.addAttribute("errorMessage", e.getMessage());
        model.addAttribute("stackTrace", Arrays.asList(e.getStackTrace()));
        return context + "/error-page";

    }

}
