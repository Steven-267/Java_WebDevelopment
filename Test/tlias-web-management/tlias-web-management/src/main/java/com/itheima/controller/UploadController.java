package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class UploadController {
    @Autowired
    private AliOSSUtils aliOSSUtils;

  /*  //本地存储文件
    @PostMapping("/upload")
    public Result upload(String name, Integer age, MultipartFile image) throws Exception {
        log.info("文件上传：{} {} {}",name,age,image);
        //获取文件的原始名字
        String originalFilename = image.getOriginalFilename();
        //构造唯一的文件名（不能重复） -UUID（通用唯一识别码）
        //以.为分隔符变成数组 获取最后一个数组的索引
        int index = originalFilename.lastIndexOf(".");
        String extname = originalFilename.substring(index);
        String newFilename = UUID.randomUUID().toString()+extname;
        log.info("文件唯一名称：{}",newFilename);

        //将文件存储到本地
        image.transferTo(new File("D:\\images\\"+newFilename));

        return Result.success();
    }*/
    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws Exception {
        log.info("文件上传：{}",image.getOriginalFilename());
        String url = aliOSSUtils.upload(image);
        log.info("文件上传完成，文件的url为：{}",url);
        return Result.success(url);
    }

}
