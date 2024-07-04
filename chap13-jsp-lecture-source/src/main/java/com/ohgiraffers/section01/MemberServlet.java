package com.ohgiraffers.section01;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/")
public class MemberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("요청 확인");

        String name = request.getParameter("name");
        System.out.println(name);

        String fullname = "박" + name;
        request.setAttribute("fullname", fullname);

        Member member = new Member("홍길동", 20);
        request.setAttribute("member", member);

        HttpSession session = request.getSession();
        session.setAttribute("fullname", "홍홍길동");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/testForward.jsp");
        dispatcher.forward(request, response);
    }
}
