package com.paige.springlearn.services;

import com.paige.springlearn.di.CustomHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class ByeService {
    @Autowired
    CustomHeader header;

    public String showHeader() {
        return "bye headers:<BR>" + header.getHeaders() + "<BR>" +
                "bye header id:<BR>" + header.getId() + "<BR>";
    }
}
