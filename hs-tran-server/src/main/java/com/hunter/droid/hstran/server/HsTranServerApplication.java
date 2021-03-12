package com.hunter.droid.hstran.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hunter.droid.hstran.server.mapper")
public class HsTranServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HsTranServerApplication.class, args);
    }

}
