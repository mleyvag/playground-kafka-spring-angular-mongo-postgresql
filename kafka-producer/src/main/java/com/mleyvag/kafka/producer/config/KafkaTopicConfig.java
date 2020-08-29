package com.mleyvag.kafka.producer.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;

    @Value(value = "${kafka.topicOne}")
    private String topicOne;

    @Value(value = "${kafka.topicTwo}")
    private String topicTwo;

    @Value(value = "${kafka.topicOne.partitions}")
    private int topicOnePartitions;

    @Value(value = "${kafka.topicOne.partitions}")
    private int topicTwoPartitions;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic topicOne() {
        return new NewTopic(topicOne, topicOnePartitions, (short) 1);
    }

    @Bean
    public NewTopic topicTwo() {
        return new NewTopic(topicTwo, topicTwoPartitions, (short) 1);
    }
}