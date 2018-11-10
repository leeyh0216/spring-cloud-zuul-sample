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

    @GetMapping("/")
    public String helloworld(){
        try {
            Thread.sleep(5000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return "Hello World";
    }

    @GetMapping("/bye")
    public String bye(){
        return "Good Bye";
    }
}
