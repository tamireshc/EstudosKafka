package com.example.consumer.listeners;

import com.example.consumer.custom.StrCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    //Este listener escuta as mensagens de uma das particoes do topico str-topic
    @StrCustomListener(groupId = "group-01")
    public void listener1(String message) {
        log.info("Received message listener 0: " + message);
    }

    // Este listener escuta as mensagens de uma outra  particoes do topico str-topic
    @StrCustomListener(groupId = "group-01")
    public void listener2(String message) {
        log.info("Received message listener 1: " + message);
    }

    // Este listener escuta as mensagens de todas as particoes do topico str-topic
    @StrCustomListener(groupId = "group-02")
    public void listener3(String message) {
        log.info("Received message listener 2: " + message);
    }
}
