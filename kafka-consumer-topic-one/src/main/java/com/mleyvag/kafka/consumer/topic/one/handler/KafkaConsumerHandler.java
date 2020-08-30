package com.mleyvag.kafka.consumer.topic.one.handler;

import com.mleyvag.kafka.consumer.topic.one.model.Message;
import com.mleyvag.kafka.consumer.topic.one.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerHandler {

    @Autowired
    private MessageRepository messageRepository;

    @KafkaListener(topics = "${kafka.topicOne}", groupId = "${kafka.groupId}")
    public void listen(String message) throws InterruptedException {
        System.out.println("Consumer-Topic-One - message: " + message);
        messageRepository.save(new Message(message));
        System.out.println("Message saved: " + message);
    }
}
