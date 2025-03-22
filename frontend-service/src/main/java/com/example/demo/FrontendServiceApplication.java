package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "backend-service", configuration = RibbonConfiguration.class)
public class FrontendServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrontendServiceApplication.class, args);
    }
}
