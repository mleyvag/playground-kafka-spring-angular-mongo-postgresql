package com.mleyvag.kafka.consumer.topic.two.handler;

import com.mleyvag.kafka.consumer.topic.two.model.MessageModel;
import com.mleyvag.kafka.consumer.topic.two.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerHandler {

    @Autowired
    private MessageRepository messageRepository;

    @KafkaListener(topics = "${kafka.topicTwo}", groupId = "${kafka.groupId}")
    public void listen(String message) throws InterruptedException {
        System.out.println("Consumer-Topic-Two - message: " + message);
        messageRepository.save(new MessageModel(message));
        System.out.println("Message was saved in postgresql..");
    }
}
