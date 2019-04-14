package com.itcast.cn.servlet.dao;

import com.itcast.cn.servlet.entity.User;
import com.itcast.cn.servlet.utils.DataSourceUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author shkstart
 * @create 2019-04-13 15:54
 */
public class UserDao {
    private JdbcTemplate temp = new JdbcTemplate(DataSourceUtils.getDataSource());


    public User findUser(String username, String password ) {

        try {
            String sql = "select * from user where username = ? and password = ?";

            return temp.queryForObject(sql,new BeanPropertyRowMapper<>(User.class) , username, password);
        } catch (DataAccessException e) {
            e.printStackTrace();

            return null;
        }



    }

}
