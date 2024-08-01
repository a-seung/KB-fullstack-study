package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("msg", "컨트롤러가 전달한 메시지 입니다.");
        request.setAttribute("imgSrc", "https://img.animalplanet.co.kr/news/2022/02/04/700/999cq8b4g8k8gw7tv8cz.jpg");
        return "about";
    }
}
