package com.itheima;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
        emp.setId(18);
        emp.setUsername("Tom67");
        emp.setName("汤姆67");
        emp.setImage("1.jpg");
        emp.setGender((short) 1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000, 1, 1));
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.update(emp);
    }

    @Test
    public void testSelect(){
        Emp emp=empMapper.getById(20);
        System.out.println(emp);
    }
    @Test
    public void testList(){
        List<Emp> empList = empMapper.list("张", (short) 1, LocalDate.of(2010, 1, 1),
                LocalDate.of(2020, 1, 1));
        System.out.println(empList);
    }
}
