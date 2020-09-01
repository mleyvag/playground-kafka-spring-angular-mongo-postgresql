package com.mleyvag.kafka.producer.controller;

public class Response {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Response(String status) {
        this.status = status;
    }

    public Response() {
    }
    
}