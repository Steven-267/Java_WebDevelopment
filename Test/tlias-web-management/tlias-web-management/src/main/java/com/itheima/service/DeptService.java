package com.itheima.service;


import com.itheima.pojo.Dept;

import java.util.List;

//部门管理
public interface DeptService {
    //查询全部部门数据
    List<Dept> lish();

    void delete(Integer id);

    //新增部门
    void add(Dept dept);
}
