package com.example.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.ai.client.AiClient;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PoetryServiceImpl implements PoetryService {

    public static final String WRITE_A_STORY_100_WORDS_ABOUT_A_DOG = """
            Write a story about a dog, with 100 words and happy ending""";

    private final AiClient aiClient;

    public String getDogStory() {
        return aiClient.generate(WRITE_A_STORY_100_WORDS_ABOUT_A_DOG);
    }
}
