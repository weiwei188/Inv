package com.prd.inv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.prd.inv.dao")
@SpringBootApplication
public class InvApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvApplication.class, args); }

}
