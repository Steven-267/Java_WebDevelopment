package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    //修改员工
    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id) ;

    @Select("select count(*) from emp")
    public Long count();

/*    @Select("select * from emp limit #{start},#{pageSize}")
    public List<Emp> page(Integer start,Integer pageSize);*/

/*    @Select("select * from emp")*/
    public List<Emp> list(
            String name,
            Short gender,
            LocalDate begin,
            LocalDate end);

    void delete(List<Integer> ids);

    //新增员工
    @Insert("insert into emp(username,name,gender,image,job,entrydate,dept_id,create_time,update_time) " +
            "VALUES (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime});")
    void insert(Emp emp);


    void update(Emp emp);
}
