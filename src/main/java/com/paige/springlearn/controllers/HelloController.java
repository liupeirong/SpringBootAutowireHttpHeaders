package com.paige.springlearn.controllers;

import com.paige.springlearn.di.CustomHeaderProvider;
import com.paige.springlearn.di.CustomHeader;
import com.paige.springlearn.services.ByeService;
import com.paige.springlearn.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    @Autowired
    HttpServletRequest request;

    @Autowired
    CustomHeaderProvider headerProvider;

    @Autowired
    HelloService helloService;

    @Autowired
    ByeService byeService;

    @RequestMapping(value = "/")
    public String index() {
        return this.showHeader() +
                helloService.showHeader() +
                byeService.showHeader();
    }

    private String showHeader()
    {
        CustomHeader header = headerProvider.get(request);
        return "controller headers:<BR>" + header.getHeaders() + "<BR>" +
                "controller header id:<BR>" + header.getId() + "<BR>";
    }
}
