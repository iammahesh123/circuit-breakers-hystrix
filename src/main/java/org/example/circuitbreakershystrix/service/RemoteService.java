package org.example.circuitbreakershystrix.service;

public interface RemoteService {
    String callService() throws InterruptedException;
}

