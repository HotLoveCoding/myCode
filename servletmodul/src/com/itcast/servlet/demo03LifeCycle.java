package com.itcast.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Timestamp;

/**
 * @author shkstart
 * @create 2019-04-12 15:28
 */
@WebServlet("/demo03")
public class demo03LifeCycle implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(new Timestamp(System.currentTimeMillis()) + "初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println(new Timestamp(System.currentTimeMillis()) + "事件处理");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("serlet销毁");

    }
}
