package com.example.demo.dao;

import com.example.demo.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDao {

     List<Emp> getUsers(@Param("page") int page,@Param("limit") int limit,@Param("name") String name,@Param("dept") String dept,@Param("degree") String degree);

     Integer getUsersCount(@Param("name") String name,@Param("dept") String dept,@Param("degree") String degree);

     Integer addUsers(@Param("name") String name,@Param("age") Integer age,@Param("sex") String sex,@Param("dept") String dept,@Param("degree") String degree,@Param("login_account") String login_account);

    Integer putUser(@Param("id") Integer id,@Param("name") String name,@Param("age") Integer age,@Param("sex") String sex,@Param("dept") String dept,@Param("degree") String degree,@Param("login_account") String login_account);

    Integer delUser(@Param("id") Integer id);
}
