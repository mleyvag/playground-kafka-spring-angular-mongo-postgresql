package com.mleyvag.kafka.producer;

import com.mleyvag.kafka.producer.service.KafkaProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner {

	@Value(value = "${kafka.topicOne}")
    private String topicOne;

    @Value(value = "${kafka.topicTwo}")
	private String topicTwo;
	
	@Autowired
    private KafkaProducerService kafkaProducerService;

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		kafkaProducerService.sendMessage("Message to topic #1", topicOne);
		kafkaProducerService.sendMessage("Message to topic #2", topicTwo);

	}

}
