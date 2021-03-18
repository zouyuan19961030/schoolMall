package com.wenli.lt;

/**
 * @author l&t
 * @version 1.0
 * @date 2021/3/17 19:49
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  启动类代码
 */
@SpringBootApplication
@MapperScan("com.wenli.lt.mapper") // 注解方式设置mapper扫描路径
public class Application {



    public static void main(String[] args) {

        SpringApplication.run(Application.class);
    }

}
