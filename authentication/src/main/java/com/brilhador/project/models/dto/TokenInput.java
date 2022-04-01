package com.brilhador.project.models.dto;

public class TokenInput {
    String token;

    public TokenInput(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
