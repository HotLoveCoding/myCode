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

/**
 * @author shkstart
 * @create 2019-04-13 20:37
 */
@WebServlet(name = "Demo04Servlet", urlPatterns ="/demo04")
public class Demo04Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset = utf-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("name");
        String gender = request.getParameter("gender");

        out.write("姓名：" + username + "<br/>");
        out.write("性别：" + gender + "<br/>");

        String[] values = request.getParameterValues("hobby");
        out.write("爱好："+ Arrays.toString(values)+ "<br/>");

        // 得到表单中所有的名字和值

        Enumeration<String> enums = request.getParameterNames();
        while(enums.hasMoreElements()) {
            // 得到每一个参数的名字
            String pname = enums.nextElement();
            // 得到每一个参数的值
            String value = request.getParameter(pname);

            out.write("参数名："+ pname + "参数值：" + value + "<br/>");
        }

        Map<String, String[]> map = request.getParameterMap();
        Set<Map.Entry<String, String[]>> set = map.entrySet();

        for (Map.Entry<String, String[]> entry : set) {
            out.write("健："+ entry.getKey()+" " + "值：" + Arrays.toString(entry.getValue()) + "<br/>");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
