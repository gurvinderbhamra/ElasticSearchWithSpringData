package com.springdataelasticsearch.SpringDataElasticSearch.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ApplicationInterceptor implements HandlerInterceptor {

    private final static Logger log = LoggerFactory.getLogger(ApplicationInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        log.info("Requested Url : " + request.getRequestURL() + "\nParams : " + request.getParameterMap() + "\n");
        return true;
    }
}
