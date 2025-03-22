package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/frontend")
    public String callBackendService() {
        String backendResponse = restTemplate.getForObject("http://backend-service/backend", String.class);
        return "Frontend received response: " + backendResponse;
    }
}
