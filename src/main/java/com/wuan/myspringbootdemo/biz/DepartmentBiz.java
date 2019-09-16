package com.wuan.myspringbootdemo.biz;



import com.wuan.myspringbootdemo.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface DepartmentBiz {
    void add(Department department);
    void edit(Department department);
    void remove(String sn);
    Department get(String sn);
    List<Department> getAll();
}
