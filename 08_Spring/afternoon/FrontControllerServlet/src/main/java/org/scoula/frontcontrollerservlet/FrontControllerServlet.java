package org.scoula.frontcontrollerservlet;

import org.scoula.frontcontrollerservlet.controller.AboutController;
import org.scoula.frontcontrollerservlet.controller.Controller;
import org.scoula.frontcontrollerservlet.controller.HomeController;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="FrontControllerServlet", value="/")
public class FrontControllerServlet extends HttpServlet {
    private Map<String, Controller> controllers = new HashMap<>();

    @Override
    public void init() throws ServletException {
        // 주소값과 컨트롤러 맵핑
        controllers.put("/", new HomeController());
        controllers.put("/about", new AboutController());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);
        String contextPath = request.getContextPath();
        System.out.println("contextPath = " + contextPath);

        String path = requestURI.substring(contextPath.length());
        System.out.println("path = " + path);

        Controller controller = controllers.get(path);

        if (controller != null) { //등록된 서비스인지 보는 과정
            String viewName = controller.getView(request, response);
            String targetView = "/WEB-INF/views/" + viewName + ".jsp";
            request.getRequestDispatcher(targetView).forward(request, response);
        } else { // 등록되지 않은 서비스면 404 에러 처리
            String notFoundView = "/WEB-INF/views/404.jsp";
            request.getRequestDispatcher(notFoundView).forward(request, response);
        }
    }
}