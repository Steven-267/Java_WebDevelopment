package com.itheima.controller;


import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    //要想调用DeptSerbice 就得使用接口调用  接口调用不能生成对象
    //所以要使用注入依赖直接生成对象 再用对象去调用service实现list()方法调用数据
    @Autowired
    private DeptService deptService;


    //查询部门数据
//    @RequestMapping(value = "/depts",method = RequestMethod.GET)//指定请求方式为GET
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");

        //调用service获取数据
        List<Dept> deptList = deptService.lish();
        return Result.success(deptList);
    }

    //删除部门
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据ID来删除部门：{}",id);
        //调用service中的delete方法
        deptService.delete(id);
        return Result.success();

    }
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门：{}",dept);
        deptService.add(dept);
        return Result.success();
    }
}
