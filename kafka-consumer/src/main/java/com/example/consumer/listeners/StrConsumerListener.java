package com.example.consumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(topicPartitions = {
            @TopicPartition(topic = "str-topic", partitions = {"0"})
    }, groupId = "str-group", containerFactory = "strContainerFactory")
    public void listener1(String message) {
        log.info("Received message listener 1: " + message);
    }

    @KafkaListener(topicPartitions = {
            @TopicPartition(topic = "str-topic", partitions = {"1"})
    }, groupId = "str-group", containerFactory = "strContainerFactory")
    public void listener2(String message) {
        log.info("Received message listener 2: " + message);
    }
}
