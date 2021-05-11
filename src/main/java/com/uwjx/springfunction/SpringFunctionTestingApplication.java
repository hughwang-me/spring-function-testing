package com.uwjx.springfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringFunctionTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFunctionTestingApplication.class, args);
    }

}
