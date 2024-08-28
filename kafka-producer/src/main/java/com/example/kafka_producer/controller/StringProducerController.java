package com.example.kafka_producer.controller;

import com.example.kafka_producer.services.StringProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class StringProducerController {
    @Autowired
    StringProducerService stringProducerService;

    @PostMapping
    public ResponseEntity sendMessage(@RequestBody String message) {
        stringProducerService.sendMessage("str-topic", message);
        return ResponseEntity.status(201).build();
    }
}
