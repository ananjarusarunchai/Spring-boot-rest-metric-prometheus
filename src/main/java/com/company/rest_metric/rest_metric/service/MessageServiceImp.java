package com.company.rest_metric.rest_metric.service;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;



@Service
public class MessageServiceImp implements MessageService {
    
    @Override
    public String getMessage(String message) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String messageResponse = "Hello " + message + " Timestamp: " + timestamp.toString();
        return  messageResponse;
    }




}
