package com.example.demo.prompt;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Prompt {

    private final List<Message> messages;
}
