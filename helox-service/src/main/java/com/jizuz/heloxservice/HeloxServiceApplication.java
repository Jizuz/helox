package com.jizuz.heloxservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HeloxServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeloxServiceApplication.class, args);
    }

}
