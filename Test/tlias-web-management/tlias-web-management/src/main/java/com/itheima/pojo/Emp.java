package com.itheima.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


//部门实体类
//ID,用户名,密码,姓名,性别 1 男 2 女,图像的url,
// 职位 1 班主任 2 讲师 3 学工主管, 教研主管,咨询师,
// 入职日期,部门ID,创建时间，修改时间
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private short gender;
    private String image;
    private short job;
    private LocalDate entrydate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;


}
