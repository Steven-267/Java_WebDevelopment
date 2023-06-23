package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import com.itheima.service.EmpService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

   @Autowired
    private EmpMapper empMapper;
    @Override
    public PageBean page(Integer page, Integer pageSize) {
        //调用Mapper方法获取总页数和列表数据
        Long count = empMapper.count();
        Integer start = (page-1)*pageSize;
        List<Emp> empList = empMapper.page(start, pageSize);
        PageBean pageBean = new PageBean(count, empList);
        return pageBean;

    }
/*@Override
public PageBean page(Integer page, Integer pageSize) {

    //1.设置分页参数
    PageHelper.startPage(page,pageSize);
    //2.执行查询
    List<Emp> empList = empMapper.list();
    Page<Emp> p = (Page<Emp>) empList; //把列表交给类Page处理 Page会根据传入的empList
                                      // 有方法可以直接生成总数据数(p.getTotal)和列表数据(p.getResult)
    //3.封装PageBean对象
    PageBean pageBean = new PageBean(p.getTotal(),p.getResult());
    return pageBean;

}*/
}
