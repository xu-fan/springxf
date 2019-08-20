package org.xu.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.xu.entity.User;

import java.util.List;

@Repository
public interface UserDao {

    @Insert("insert into user(name,age) value(#{name},#{age})")
    void insert(User user);

    @Select("select * from user")
    List<User> QueryAll();
}
