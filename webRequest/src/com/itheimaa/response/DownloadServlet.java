package com.itheimaa.response;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * @author shkstart
 * @create 2019-04-15 16:30
 */
@WebServlet(name = "DownloadServlet", urlPatterns = "/down")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //从链接上得到文件名
        String filename = request.getParameter("filename");
        System.out.println("文件名："+ filename);
        //得到文件输入流，得到上下文对象
        InputStream in = getServletContext().getResourceAsStream("/download/" +filename );

        //对汉字进行编码操作,浏览器会自动的进行解码

        filename = URLEncoder.encode(filename, "utf-8");

       response.setHeader("content-disposition","attachment;filename =" + filename);

       //得到response输出流
        ServletOutputStream out = response.getOutputStream();

        IOUtils.copy(in, out);

        out.close();
        in.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
