package com.young;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.young.mapper")  //扫描指定的mapper映射文件
@SpringBootApplication
public class YoungBlogMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoungBlogMasterApplication.class, args);
    }

}
