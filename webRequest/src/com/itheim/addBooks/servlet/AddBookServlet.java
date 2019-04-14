package com.itheim.addBooks.servlet;

import com.itheim.addBooks.entity.Book;
import com.itheim.addBooks.service.BookService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author shkstart
 * @create 2019-04-13 23:08
 */
@WebServlet(name = "AddBookServlet", urlPatterns = "/addbook")
public class AddBookServlet extends HttpServlet {
    private BookService service = new BookService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        response.setContentType("text/html; charset = utf-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("utf-8");

        Map<String, String[]> map = request.getParameterMap();

        Book book = new Book();

        try {
            BeanUtils.populate(book, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        int row = service.addBook(book);


            if(row > 0) {
                out.print("添加成功");
            } else{
                out.print("添加失败");

            }




        out.close();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request, response);
    }
}
