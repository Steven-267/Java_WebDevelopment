package com.itheima.mapper;


import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {


    //查找表格信息
    @Select("Select * from dept")
    List<Dept> list();

    //根据ID删除部门
    @Delete("Delete from dept where id = #{id}")
    void deleteById(Integer id);

    //新增部门信息
    @Insert("insert into dept(name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);
}
