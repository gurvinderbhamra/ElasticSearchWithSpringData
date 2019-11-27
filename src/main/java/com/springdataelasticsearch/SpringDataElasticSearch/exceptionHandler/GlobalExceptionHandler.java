package com.springdataelasticsearch.SpringDataElasticSearch.exceptionHandler;

import com.springdataelasticsearch.SpringDataElasticSearch.dto.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler({Exception.class})
    public HttpEntity<ErrorResponse> exceptionHandler(Exception e) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(e.getMessage());
        MultiValueMap<String, String> multiValueMap = new HttpHeaders();
        multiValueMap.add("message", e.getMessage());
        e.printStackTrace();
        log.error("Exception occurred : " + e.getMessage());
        return new ResponseEntity<>(errorResponse, multiValueMap, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
