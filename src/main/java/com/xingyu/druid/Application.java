package com.xingyu.druid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yangxingyu
 * @date 2020/1/17
 * @description
 */
@SpringBootApplication(scanBasePackages = {"com.xingyu.druid"})
@MapperScan(basePackages ={"com.xingyu.druid.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
