package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//分页查询结果的封装类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean {

    private Long total;//总记录数
    private List rows;//数据列表->需要起始索引和信息列表

}
//not code --151 2023/7/3