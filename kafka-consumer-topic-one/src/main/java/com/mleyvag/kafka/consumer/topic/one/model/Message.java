package com.mleyvag.kafka.consumer.topic.one.model;

import org.springframework.data.annotation.Id;

public class Message {

    @Id
    private String id;

    private String content;

    public Message() {}

    public Message(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
