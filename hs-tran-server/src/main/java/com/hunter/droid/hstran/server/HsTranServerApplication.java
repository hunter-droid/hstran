package com.hunter.droid.hstran.server;

import org.apache.commons.io.FileUtils;
import org.apache.lucene.util.IOUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;
import xmetric.XMetric;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
@MapperScan("com.hunter.droid.hstran.server.domin.*.repository.mapper")
public class HsTranServerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(HsTranServerApplication.class, args);
    }

}
