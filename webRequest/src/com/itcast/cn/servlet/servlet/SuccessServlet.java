package com.itcast.cn.servlet.servlet;

import com.itcast.cn.servlet.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shkstart
 * @create 2019-04-13 16:21
 */
@WebServlet( "/success")
public class SuccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset = utf-8");
        PrintWriter out = response.getWriter();

        User user = (User)request.getAttribute("user");

        out.write("恭喜:"+ user.getUsername() + "登录成功");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
