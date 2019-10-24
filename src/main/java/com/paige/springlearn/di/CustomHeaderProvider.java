package com.paige.springlearn.di;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.servlet.http.HttpServletRequest;

@Component
public class CustomHeaderProvider {

    @Bean
    @RequestScope
    public CustomHeader get(HttpServletRequest request) {
        return CustomHeader.createFromHttpRequest(request);
    }
}
