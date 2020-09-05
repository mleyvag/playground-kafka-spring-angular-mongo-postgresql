package com.mleyvag.kafka.producer.controller;

import com.mleyvag.kafka.producer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
public class KafkaProducerController {


    @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}
    
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
    public ResponseEntity<Response> sendToTopicTwo(@PathVariable final String msg) {
        kafkaProducerService.sendMessage(msg, topicTwo);
        return ResponseEntity.ok(new Response("message was sended to topicTwo!"));
    }

}
