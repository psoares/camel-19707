package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileSystemUtils;

import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootApplication
public class DemoApplication implements InitializingBean {

    @Value("${data-dir}")
    private Path dataDir;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Files.createDirectories(dataDir);
        // Create an empty file in dataDir
        Files.createFile(dataDir.resolve("empty.txt"));
    }
}
