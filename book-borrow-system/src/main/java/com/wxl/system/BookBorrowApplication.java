package com.wxl.system;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Admin
 */
@SpringBootApplication (exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.xmy.system.mapper.borrow")
@EnableScheduling
public class BookBorrowApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookBorrowApplication.class,args);
    }
}
