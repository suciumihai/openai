package com.example.demo.exception;

import com.theokanning.openai.OpenAiHttpException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.Optional;

@ControllerAdvice
public class ExceptionHandler {

    public static final String OPEN_AI_CLIENT_EXCEPTION = "Open AI client raised exception";

    @org.springframework.web.bind.annotation.ExceptionHandler
    ProblemDetail handleOpenAiHttpException(OpenAiHttpException ex) {
        HttpStatus status = Optional
                .ofNullable(HttpStatus.resolve(ex.statusCode))
                .orElse(HttpStatus.BAD_REQUEST);
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(status, ex.getMessage());
        problemDetail.setTitle(OPEN_AI_CLIENT_EXCEPTION);
        return problemDetail;
    }
}
