package com.example.demo.service.impl;

import com.example.demo.dao.EmpDao;
import com.example.demo.dao.impl.EmpDaoA;
import com.example.demo.pojo.Emp;
import com.example.demo.service.EmpService;

import java.util.List;

public class EmpServiceA implements EmpService {
    private EmpDao empDao = new EmpDaoA();
    @Override
    public List<Emp> listEmp() {

        //调用Dao获取数据
        List<Emp> empList = empDao.listEmp();
        empList.stream().forEach(emp ->{
            //处理gender
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            //处理job
            String job = emp.getJob();
            if("1".equals(emp.getJob())){
                emp.setJob("讲师");
            }else if("2".equals(emp.getJob())){
                emp.setJob("班主任");
            }else if("3".equals(emp.getJob())){
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
