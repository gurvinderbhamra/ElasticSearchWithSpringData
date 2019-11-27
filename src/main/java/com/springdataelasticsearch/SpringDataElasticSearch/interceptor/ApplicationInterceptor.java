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
        String informationString = "Requested Url : " + request.getRequestURL() + "\n";
        if (!request.getParameterMap().isEmpty()) informationString += "Params : " + request.getParameterMap() + "\n";
        log.info(informationString);
        return true;
    }
}
