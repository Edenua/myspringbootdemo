package com.wuan.myspringbootdemo.biz;


import com.wuan.myspringbootdemo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;


public interface GlobalBiz {
    Employee login(String sn, String password);
    void changePassword(Employee employee);
}
