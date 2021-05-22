package com.hunter.droid.hstran.server;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.hunter.droid.hstran.server.domin.*.repository.mapper")
public class HsTranServerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(HsTranServerApplication.class, args);
    }

}
