package com.itcast.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shkstart
 * @create 2019-04-12 15:17
 */

@WebServlet("/demo02")
public class demo02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset = utf-8");
        PrintWriter out = resp.getWriter();

        out.write("<h1 style = 'color:green'>实现中华民族的伟大复兴，需要每一个中华儿女去努力奋斗</h1>");
    }
}
