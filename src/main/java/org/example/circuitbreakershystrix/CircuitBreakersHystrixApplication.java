package org.example.circuitbreakershystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class CircuitBreakersHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakersHystrixApplication.class, args);
    }

}
