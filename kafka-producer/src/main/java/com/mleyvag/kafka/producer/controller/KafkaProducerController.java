package com.mleyvag.kafka.producer.controller;

import com.mleyvag.kafka.producer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

   @Autowired
   private KafkaProducerService kafkaProducerService;

    @Value(value = "${kafka.topicOne}")
    private String topicOne;

    @Value(value = "${kafka.topicTwo}")
    private String topicTwo;

    @GetMapping("/send/topic1/{msg}")
    public String sendToTopicOne(@PathVariable String msg) {
        kafkaProducerService.sendMessage(msg, topicOne);
        return "message was sended to topicOne!";
    }

    @GetMapping("/send/topic2/{msg}")
    public String sendToTopicTwo(@PathVariable String msg) {
        kafkaProducerService.sendMessage(msg, topicTwo);
        return "message was sended to topicTwo!";
    }

}
