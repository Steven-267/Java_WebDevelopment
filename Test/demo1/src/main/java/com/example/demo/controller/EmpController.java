package com.example.demo.controller;

import com.example.demo.pojo.Emp;
import com.example.demo.pojo.Result;
import com.example.demo.service.EmpService;
import com.example.demo.service.impl.EmpServiceA;
import com.example.demo.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    private EmpService empService = new EmpServiceA();
    @RequestMapping("/listEmp")
    public Result list(){
        List<Emp> empList = empService.listEmp();
        //System.out.println("ggs-20230608");


        //3.响应数据
        return Result.success(empList);

       /* //1.加载并解析emp.xml
        String file = "D:\\Java_Github_code\\Java_WebDevelopment\\Test\\demo1\\src\\main\\resources";
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        //2.对数据进行转换处理-gender,job
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



        //3.响应数据
        return Result.success(empList);*/
    }
}
