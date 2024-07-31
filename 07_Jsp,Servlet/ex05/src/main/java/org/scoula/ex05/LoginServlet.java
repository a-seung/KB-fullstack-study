package org.scoula.ex05;

import org.scoula.ex05.domain.Member;
import org.scoula.ex05.dto.LoginDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");

        LoginDTO loginDTO = new LoginDTO(userid, passwd);
        //DTO 객체로 맵핑한 것임

        request.setAttribute("userid", userid);
        request.setAttribute("passwd", passwd);

        request.setAttribute("login", loginDTO);
        //loginDTO를 login이라는 이름으로 저장해 줌

        // 로그인 처리
        HttpSession session = request.getSession();
        Member member = new Member("이승아", userid);
        session.setAttribute("user", member);

        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        doGet(request, response);
//    }
//}