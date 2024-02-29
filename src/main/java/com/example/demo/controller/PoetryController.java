package com.example.demo.controller;

import com.example.demo.service.PoetryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ai")
public class PoetryController {

    private final PoetryService poetryService;

    public PoetryController(PoetryService poetryService) {
        this.poetryService = poetryService;
    }

    @GetMapping("/dogstory")
    public ResponseEntity<String> generateDogStory(){
        return ResponseEntity.ok(poetryService.getDogStory());
    }
}
