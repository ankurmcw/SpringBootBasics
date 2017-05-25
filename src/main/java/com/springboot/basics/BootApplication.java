package com.springboot.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by renuka on 29/3/17.
 */

@SpringBootApplication
@RestController
public class BootApplication {

    /*@RequestMapping("/")
    public String sayHello() {
        return "Hello World";
    }*/

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
