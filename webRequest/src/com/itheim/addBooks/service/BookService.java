package com.itheim.addBooks.service;

import com.itheim.addBooks.dao.BookDao;
import com.itheim.addBooks.entity.Book;

/**
 * @author shkstart
 * @create 2019-04-13 23:06
 */
public class BookService {
    private BookDao bookDao = new BookDao();

    public int addBook(Book book) {

        return bookDao.saveBook(book);
    }
}
