package com.leeyh0216.sampleserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleServer {

    public static void main(String[] args) {
        SpringApplication.run(SampleServer.class, args);
    }

    @GetMapping("/sample")
    public String helloworld(){
        return "Hello World";
    }

    @GetMapping("/sample/bye")
    public String bye(){
        return "Good Bye";
    }
}
