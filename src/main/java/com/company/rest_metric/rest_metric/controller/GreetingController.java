package com.company.rest_metric.rest_metric.controller;

import com.company.rest_metric.rest_metric.service.MessageService;
import com.company.rest_metric.rest_metric.service.MessageServiceImp;
import io.prometheus.client.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Greeting")
public class GreetingController {

    @Autowired
    MessageServiceImp messageServiceImp;

    static final Counter requests = Counter.build()
            .name("greeting_requests_total")
            .help("Total requests.").register();

    @GetMapping("/{name}")
    public String Hello(@PathVariable String name){
        requests.inc();
        return messageServiceImp.getMessage(name);
    }
}
