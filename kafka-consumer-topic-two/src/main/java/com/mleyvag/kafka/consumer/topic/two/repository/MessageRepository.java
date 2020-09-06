package com.mleyvag.kafka.consumer.topic.two.repository;

import com.mleyvag.kafka.consumer.topic.two.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageModel, Long> {



}
