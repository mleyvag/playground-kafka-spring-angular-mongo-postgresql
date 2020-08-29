package com.mleyvag.kafka.consumer.topic.one.handler;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerHandler {

    @KafkaListener(topics = "${kafka.topicOne}", groupId = "${kafka.groupId}")
    public void listen(String message) throws InterruptedException {
        System.out.println("Consumer-Topic-One - message: " + message);
    }
}
