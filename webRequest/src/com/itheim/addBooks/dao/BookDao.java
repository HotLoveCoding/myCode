package com.itheim.addBooks.dao;

import com.itheim.addBooks.entity.Book;
import com.itheim.addBooks.utils.DataSourceUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author shkstart
 * @create 2019-04-13 22:51
 */
public class BookDao {
    private JdbcTemplate temp = new JdbcTemplate(DataSourceUtils.getDataSource());

    public int saveBook(Book book) {

        try {
            String sql = "insert into book values(null,?,?,?,?)";

            return  temp.update(sql,book.getName(),book.getTime(),book.getType(),book.getAuthor());
        } catch (DataAccessException e) {
            throw new RuntimeException(e);
        }

    }

}
