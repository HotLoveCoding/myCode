package com.itheima.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 判断浏览器的类型
 */
@WebServlet(name = "Demo3BrowserServlet", urlPatterns = "/demo03")
public class Demo3BrowserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //原理：得到user-agent请求头，判断它的值是否包含了指定的字符串，区分不同的浏览器
        //得到user-agent请求头的值
        String agent = request.getHeader("user-agent");
        out.print("您的浏览器是：");
        //判断字符串，Edge、Chrome、Safari、Firefox、IE浏览器或其它
        if (agent.contains("Edge")) {
            out.print("Edge");
        }
        else if (agent.contains("Chrome")) {
            out.print("Chrome");
        }
        else if (agent.contains("Safari")) {
            out.print("Safari");
        }
        else if (agent.contains("Firefox")) {
            out.print("Firefox");
        }
        else {
            out.print("IE浏览器或其它");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
