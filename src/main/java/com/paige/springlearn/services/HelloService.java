package com.paige.springlearn.services;

import com.paige.springlearn.di.CustomHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class HelloService {

    @Autowired
    CustomHeader header;

    public String showHeader() {
        return "hello headers:<BR>" + header.getHeaders() + "<BR>" +
                "hello header id:<BR>" + header.getId() + "<BR>";
    }
}
