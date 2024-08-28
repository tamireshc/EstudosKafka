package com.example.consumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(topics = "str-topic", groupId = "str-group", containerFactory = "strContainerFactory")
    public void listen(String message) {
        log.info("Received message: " + message);
    }
}
