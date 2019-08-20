package org.xu.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.xu.dao.UserDao;
import org.xu.entity.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DaoTest {

    @Test
    public void testQueryAll() throws IOException{
        InputStream is = Resources.getResourceAsStream("mybatis-Config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.QueryAll();
        for(User user : users){
            System.out.println(user.toString());
        }
        session.close();
        is.close();
    }

    @Test
    public void testInsert() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-Config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = new User();
        user.setName("需");
        user.setAge(16);
        user.setId(14);
        userDao.insert(user);
        session.commit();
        session.close();
        is.close();
    }
}
