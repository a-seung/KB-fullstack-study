package org.scoula.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //자바bean으로 등록이되게하는 어노테이션
@Slf4j //롬복에서 제공해주는 어노테이션, log라는 멤버 변수가 자동으로 생김
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name","홍길동");
        return "index"; // View의 이름 > 실제경로 : WEB-INF/views/index.jsp
    }
}
