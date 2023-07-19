package com.example.demo.emp;

import com.example.demo.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpDao empDao;

    public Object getUserList(int page,int limit,String name,String dept,String degree){
        return empDao.getUsers(page,limit,name,dept,degree);
    }

    public Object getUsersCount(String name,String dept,String degree){
        return empDao.getUsersCount(name,dept,degree);
    }

    public Object addUser(String name,Integer age,String sex,String dept,String degree,String loginAcount){
        return empDao.addUsers(name,age,sex,dept,degree,loginAcount);
    }

    public Object putUser(Integer id ,String name,Integer age,String sex,String dept,String degree,String loginAcount){
        return empDao.putUser(id,name,age,sex,dept,degree,loginAcount);
    }

    public Object delUser(Integer id ){
        return empDao.delUser(id);
    }
}
