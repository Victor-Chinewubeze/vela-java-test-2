package com.unbabel.challenge.utils;

import org.springframework.http.HttpHeaders;

public class HeaderUtil {
    public static HttpHeaders setHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        return headers;
    }
}
