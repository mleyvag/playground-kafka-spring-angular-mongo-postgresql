package com.mleyvag.kafka.consumer.topic.two.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MessageModel {

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    public MessageModel() {
    }

    public MessageModel(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
