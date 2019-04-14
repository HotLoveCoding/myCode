package com.itheima.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "Demo4RegServlet", urlPatterns = "/demo4")
public class Demo4RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //设置请求的编码是utf-8
        request.setCharacterEncoding("utf-8");

        //1. 得到注册页面的用户名和性别，输出到浏览器
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        out.print("姓名：" + name + "<br/>");
        out.print("性别：" + gender + "<br/>");
        //2. 得到所有的爱好，输出到浏览器
        String[] hobbies = request.getParameterValues("hobby");
        out.print("爱好：" + Arrays.toString(hobbies) + "<br/>");
        //3. 得到所有表单的名字和值，输出到浏览器
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()) {
            String pname = parameterNames.nextElement();   //得到每个参数的名字
            String value = request.getParameter(pname);   //得到每个参数的值
            out.print("参数名：" + pname + "，参数值：" + value + "<br/>");
        }
        //4. 得到封装好的表单数据Map对象，输出到浏览器。Map中键就是参数名，值就是参数值
        Map<String, String[]> parameterMap = request.getParameterMap();
        //遍历Map
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            out.print("键：" + entry.getKey() + "，值：" + Arrays.toString(entry.getValue()) + "<br/>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
