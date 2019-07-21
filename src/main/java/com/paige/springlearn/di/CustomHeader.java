package com.paige.springlearn.di;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class CustomHeader {
    private final Map<String, String> headers = new HashMap<>();

    public String getHeaders() {
        return headers.toString();
    }

    public String getId() {
        return this.toString();
    }

    public static CustomHeader createFromHttpRequest(HttpServletRequest request)
    {
        CustomHeader header = new CustomHeader();

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements())
        {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            header.headers.put(headerName, headerValue);
        }
        return header;
    }
}
