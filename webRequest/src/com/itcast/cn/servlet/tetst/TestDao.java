package com.itcast.cn.servlet.tetst;

import com.itcast.cn.servlet.dao.UserDao;
import org.junit.Test;

/**
 * @author shkstart
 * @create 2019-04-13 16:08
 */
public class TestDao {

    @Test
    public void testDao() {

        UserDao user = new UserDao();

        user.findUser("jack","123");

        System.out.println(user);
    
    }
}
