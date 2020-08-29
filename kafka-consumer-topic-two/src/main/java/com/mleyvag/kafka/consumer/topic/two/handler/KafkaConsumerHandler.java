package com.mleyvag.kafka.consumer.topic.two.handler;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerHandler {

    @KafkaListener(topics = "${kafka.topicTwo}", groupId = "${kafka.groupId}")
    public void listen(String message) throws InterruptedException {
        System.out.println("Consumer-Topic-Two - message: " + message);
    }
}
