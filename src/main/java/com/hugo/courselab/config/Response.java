package com.hugo.courselab.config;

public class Response {
    public static String configureResponse(String status, String body){
        return "{\n" +
                "  \"status\":\"" + status + "\",\n" +
                "  \"body\":\"" + body + "\"\n" +
                "}";
    }
}