package com.Aniruddha.FirstSpringB;

public class HelloResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloResponse(String message) {
        this.message = message;
    }
}
