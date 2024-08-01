package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("imgSrc", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTitXbdqn5OugCcYAi7-kGnzvIn7aGASgLaGA&s");
        return "index";
    }
}
