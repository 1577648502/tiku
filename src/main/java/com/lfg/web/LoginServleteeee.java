package com.lfg.web;

import com.alibaba.fastjson.JSON;
import com.lfg.mapper.UserMapper;
import com.lfg.pojo.User;
import com.lfg.util.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@WebServlet("/test")
public class LoginServleteeee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/json;charset=utf-8");
        String name = request.getParameter("name");
//        String name = "北校区";
        name = new String(name.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);

        String replace = name.replace("\"", "");
        //1.加载mybatis的核心配置文件，获取SqlSessionFactory
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
//        2.获取sqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        调用方法
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用方法
//        3.执行sql
//        System.out.println(replace);
//        List<User> users = sqlSession.selectList("test.selectAll1", replace);
        List<User> users = userMapper.selectAll1(name);
        String s = JSON.toJSONString(users);
        System.out.println(users);
        response.getWriter().write(s);
//        users.forEach(
//                res -> {
//                    try {
////                        String s = JSON.toJSONString(res);
//                        response.getWriter().println("题目"+res.getTitle()+" 答案："+res.getDaan());
//                        response.getWriter().println("<br/>");
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                });


//        System.out.println(users);


        //4.释放资源
//        sqlSession.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
