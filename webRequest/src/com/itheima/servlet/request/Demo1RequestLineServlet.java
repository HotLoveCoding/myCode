package com.itheima.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Demo1RequestLineServlet", urlPatterns = "/demo1")
public class Demo1RequestLineServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置内容的类型和字符集
        response.setContentType("text/html;charset=utf-8");
        //得到打印流
        PrintWriter out = response.getWriter();
        out.print("请求的方式：" + request.getMethod() + "<br/>");
        out.print("得到请求的URI: " + request.getRequestURI() + "<br/>");
        out.print("得到请求的URL: " + request.getRequestURL() + "<br/>");
        out.print("得到版本和协议：" + request.getProtocol() + "<br/>");
        //Context 上下文
        out.print("得到当前项目的访问地址：" + request.getContextPath() + "<br/>");
        out.print("得到客户端的IP地址(默认是IPV6)：" + request.getRemoteAddr() + "<br/>");
        out.print("得到当前Servlet的访问地址：" + request.getServletPath() + "<br/>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
