package com.ohgiraffers.section03.status;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/status")
public class Status extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 200, 400, 401, 404, 500
        response.sendError(204,"보내줄 수 있는 컨텐츠가 없습니다.");
        response.sendError(401, "인증되지 않은 사용자입니다. 인증이 필요합니다.");
        response.sendError(403, "접근할 권한이 없는 페이지입니다.");
        response.sendError(404, "없는 페이지입니다. 경로를 확인해 주세요.");
    }
    // a  태그는 왜 post 가 필요없나
}
