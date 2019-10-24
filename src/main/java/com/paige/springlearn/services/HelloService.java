package com.paige.springlearn.services;

import com.paige.springlearn.di.CustomHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    CustomHeader header;

    public String showHeader() {
        return "hello headers:<BR>" + header.getHeaders().toString() + "<BR>" +
                "hello header id:<BR>" + header.getId() + "<BR>";
    }
}
