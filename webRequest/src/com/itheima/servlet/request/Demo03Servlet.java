package com.itheima.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shkstart
 * @create 2019-04-13 19:52
 */
@WebServlet(name = "Demo03Servlet", urlPatterns = "/demo3")
public class Demo03Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset = utf-8");
        PrintWriter out = response.getWriter();

        String header = request.getHeader("user-agent");

        out.print("你的浏览器是：");

        if(header.contains("Edge")) {
            out.print("Edge");
        } else if(header.contains("Chrome")) {

            out.print("Chrome");
        } else if(header.contains("Safari")) {

            out.print("Safari");
        } else if(header.contains("Firefox")) {

            out.print("Firefox");
        } else{
            out.print("IE浏览器或者其它");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);

    }
}
