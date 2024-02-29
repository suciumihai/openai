package com.example.demo.prompt;

import org.springframework.ai.prompt.messages.MessageType;

import java.util.Map;

public interface Message {

    String getContent();
    Map<String, Object> getProperties();
    MessageType getMessageType();
}
