package com.itheima.service.impl;

import com.itheima.mapper.DeptMapper;
import com.itheima.pojo.Dept;
import com.itheima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    //在service层不能实现对数据的数据的获取 所以要通过接口调用Mapper（dao层）
    //从而实现对数据库数据的获取 注入DeptMapper的依赖 自动生成deptMapper的对象
    //再调用deptMapper对象的list()方法 而在daptMapper的lish()方法中
    //将返回一个泛型为Dept的链表集合
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> lish() {
        //调取mapper(dao)获取数据
        return deptMapper.list();
    }

    @Override
    public void delete(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.insert(dept);
    }
}
