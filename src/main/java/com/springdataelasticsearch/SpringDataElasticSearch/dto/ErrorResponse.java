package com.springdataelasticsearch.SpringDataElasticSearch.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse<T> {
    private Long timestamp;
    private String error;
    private String message;
    private Integer code = 1;
    private Integer status = 200;
    private T data;

    public ErrorResponse(Long timestamp, String error, String message, Integer code, Integer status, T data) {
        this.timestamp = timestamp;
        this.error = error;
        this.message = message;
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public ErrorResponse() { }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
