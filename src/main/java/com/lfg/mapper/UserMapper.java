package com.lfg.mapper;

import com.lfg.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    List<User> selectAll1(String s);

    @Select("SELECT * FROM tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String username, @Param("password") String password);

//查找用户
    @Select("select * from tb_user where username = #{username}")
    User selectUsername (String username);
//添加用户
    @Insert("insert into tb_user values (null,#{username},#{password})")
    void add(User user);

}
