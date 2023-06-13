package com.itheima;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {

    @Autowired
    public EmpMapper empMapper;

    @Test
    public void testDelete() {
        empMapper.delete(9);
    }

    @Test
    public void testInsert() {
        Emp emp = new Emp();
        emp.setUsername("Tom3");
        emp.setName("汤姆3");
        emp.setImage("1.jpg");
        emp.setGender((short) 1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000, 1, 1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.insert(emp);
        System.out.println(emp.getId());
    }
    @Test
    public void testUpdate() {
        Emp emp = new Emp();
//        emp.setId(20);
        emp.setUsername("Tom676767");
//        emp.setName("汤姆6767");
//        emp.setGender((short)2);
//        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update2(emp);
    }

    @Test
    public void testSelect(){
        Emp emp=empMapper.getById(20);
        System.out.println(emp);
    }
    @Test
    public void testList(){
        List<Emp> empList = empMapper.list(null, (short) 1, null,null);
        System.out.println(empList);
    }
    @Test
    public void testDeleteByIds(){
        List<Integer> ids = Arrays.asList(13,14,15);
        empMapper.deleteByIds(ids);
    }
}
