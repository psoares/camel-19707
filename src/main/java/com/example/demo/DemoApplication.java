package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        Path emptyFile = dataDir.resolve("empty.txt");
        if (!Files.exists(emptyFile)) {
            Files.createFile(emptyFile);
        }
    }
}
