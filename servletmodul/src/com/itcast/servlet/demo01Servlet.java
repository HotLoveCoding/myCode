package com.itcast.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shkstart
 * @create 2019-04-12 14:46
 */
public class demo01Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应头
        response.setContentType("text/html; charset = utf-8");

        // 向浏览器输出内容
        PrintWriter out = response.getWriter();
        out.write("<h1 style= 'color:blue'>my first servlet</h1>");
    }
}
