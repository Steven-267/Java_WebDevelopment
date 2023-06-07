package com.example.demo.dao.impl;

import com.example.demo.dao.EmpDao;
import com.example.demo.pojo.Emp;
import com.example.demo.utils.XmlParserUtils;

import java.util.List;

public class EmpDaoA  implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file = "D:\\Java_Github_code\\Java_WebDevelopment\\Test\\demo1\\src\\main\\resources";
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
