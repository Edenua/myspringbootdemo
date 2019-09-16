package com.wuan.myspringbootdemo.biz;



import com.wuan.myspringbootdemo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface EmployeeBiz {
    void add(Employee employee);
    void edit(Employee employee);
    void remove(String sn);
    Employee get(String sn);
    List<Employee> getAll();
}
