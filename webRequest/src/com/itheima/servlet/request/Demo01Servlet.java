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
 * @create 2019-04-13 17:23
 */
@WebServlet(name = "Demo01Servlet"  , urlPatterns = "/demo01")
public class Demo01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset = utf-8");
        PrintWriter out = response.getWriter();

        out.write("请求的方法：" + request.getMethod()+"<br/>");
        out.write("请求的uri:" + request.getRequestURI()+ "<br/>");
        out.write("请求的url:" + request.getRequestURL() + "<br/>");
        out.write("请求的协议：" + request.getProtocol()+"<br/>");

        out.write("请求的上下文路径：" + request.getContextPath() + "<br/>");
        out.write("客户端ip地址：" +request.getRemoteAddr() +"<br/>");
        out.write("访问地址：" + request.getServletPath());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
