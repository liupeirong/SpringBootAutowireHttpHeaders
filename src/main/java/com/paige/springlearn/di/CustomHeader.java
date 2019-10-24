package com.paige.springlearn.di;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomHeader {
    private final Map<String, String> headers = new HashMap<>();

    public CustomHeader() {
        instanceCounter.incrementAndGet();
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getId() {
        return this.toString();
    }

    private static final AtomicInteger instanceCounter = new AtomicInteger(0);

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

    public static int getInstanceCount()
    {
        return instanceCounter.get();
    }
}
