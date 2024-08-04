package org.scoula;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 요청에서 파라미터 얻기
        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");

        // 응답 내보내기
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("아이디값: " + userid + "<br>");
        out.println("비밀번호값: " + passwd + "<br>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}