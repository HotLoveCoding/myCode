package com.itheima.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/*
1. 得到user-agent请求头的值
2. 得到所有的请求头信息，并输出所有的请求值信息
 */
@WebServlet(name = "Demo2HeaderServlet", urlPatterns = "/demo02")
public class Demo2HeaderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //得到user-agent请求头的值
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //通过请求头的名字，得到请求头的值
        String userAgent = request.getHeader("user-agent");
        out.print("浏览器的类型：" + userAgent + "<hr/>");
        //得到所有的请求头,返回Enumeration枚举类，类似于迭代器Iterator
        Enumeration<String> headerNames = request.getHeaderNames();
        //遍历枚举类型
        while(headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();  //得到每一个键
            String value = request.getHeader(header);  //得到每一个值
            out.print("请求头名字：" + header + " 值：" + value + "<br/>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
