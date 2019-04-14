package com.itheima.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author shkstart
 * @create 2019-04-13 19:04
 */
@WebServlet(name = "Demo02Servlet" , urlPatterns = "/demo2")
public class Demo02Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset = utf-8");
        PrintWriter out = response.getWriter();

        String header = request.getHeader("user-agent");
        out.write("浏览器的类型：" + header + "<br/>");

        Enumeration<String> headerNames = request.getHeaderNames();
        //遍历枚举类型
        while(headerNames.hasMoreElements()) {
            String head = headerNames.nextElement();  //得到每一个键
            String value = request.getHeader(head);  //得到每一个值
            out.print("请求头名字：" + head + " 值：" + value + "<br/>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
