package com.mleyvag.kafka.producer.controller;

import com.mleyvag.kafka.producer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class KafkaProducerController {

   @Autowired
   private KafkaProducerService kafkaProducerService;

    @Value(value = "${kafka.topicOne}")
    private String topicOne;

    @Value(value = "${kafka.topicTwo}")
    private String topicTwo;

    @GetMapping("/send/topic1/{msg}")
    public ResponseEntity<Response> sendToTopicOne(@PathVariable final String msg) {
        kafkaProducerService.sendMessage(msg, topicOne);
        return ResponseEntity.ok(new Response("message was sended to topicOne!"));
    }

    @GetMapping("/send/topic2/{msg}")
    public String sendToTopicTwo(@PathVariable final String msg) {
        kafkaProducerService.sendMessage(msg, topicTwo);
        return ResponseEntity.ok(new Response("message was sended to topicTwo!"));
    }

}
