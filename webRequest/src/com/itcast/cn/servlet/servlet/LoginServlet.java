package com.itcast.cn.servlet.servlet;

import com.itcast.cn.servlet.entity.User;
import com.itcast.cn.servlet.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shkstart
 * @create 2019-04-13 16:12
 */
@WebServlet(name = "login" ,  urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset = utf-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
         String password = request.getParameter("password");

        UserService service = new UserService();

        User user = service.login(username, password);

        if(user != null) {
            request.setAttribute("user", user);
            request.getRequestDispatcher("success").forward(request, response);

        } else{


            response.sendRedirect("failure.html");

           // out.write("登录失败");



        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
