package com.mleyvag.kafka.consumer.topic.one.repository;

import com.mleyvag.kafka.consumer.topic.one.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {

}
