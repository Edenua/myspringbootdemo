package com.wuan.myspringbootdemo.biz.impl;


import com.wuan.myspringbootdemo.biz.DepartmentBiz;
import com.wuan.myspringbootdemo.dao.DepartmentDao;
import com.wuan.myspringbootdemo.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentBiz")
public class DepartmentBizImpl implements DepartmentBiz {
    @Autowired
    private DepartmentDao departmentDao;

    public void add(Department department) {
        departmentDao.insert(department);
    }

    public void edit(Department department) {
        departmentDao.update(department);
    }

    public void remove(String sn) {
        departmentDao.delete(sn);
    }

    public Department get(String sn) {
        return departmentDao.select(sn);
    }

    public List<Department> getAll() {
        return departmentDao.selectAll();
    }
}
