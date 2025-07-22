package com.example.ConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${message}")
    String message;

    @GetMapping("/message")
    public ResponseEntity<String> getMessage(){
        return  ResponseEntity.status(HttpStatus.OK).body(message);
    }

}
