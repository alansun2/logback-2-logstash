package com.example.demo;

import com.example.demo.a.test1;
import com.example.demo.b.test2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LagbakLogstashApplication {

    public static void main(String[] args) {
        SpringApplication.run(LagbakLogstashApplication.class, args);
        test1 test1 = new test1();
        test1.tezt();
        test2 test2 = new test2();
        test2.tezt();
    }

}
