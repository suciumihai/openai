package com.example.demo.generation;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class Generation {
    private final String text;
    private Map<String, Object> info;
}
