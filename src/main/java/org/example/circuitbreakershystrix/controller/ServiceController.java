package org.example.circuitbreakershystrix.controller;

import org.example.circuitbreakershystrix.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @Autowired
    private RemoteService remoteService;

    @GetMapping("/service")
    public String callService() {
        try {
            return remoteService.callService();
        } catch (InterruptedException e) {
            return "Failed to call service";
        }
    }


}

