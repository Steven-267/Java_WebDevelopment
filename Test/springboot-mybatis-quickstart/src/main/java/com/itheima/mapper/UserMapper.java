package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper//在运行时会自动生成关于该接口的实现类对象（代理对象），并且会将该对象交给IOC容器管理
public interface UserMapper {
    @Select("Select * from user")
    public List<User> list();

}
