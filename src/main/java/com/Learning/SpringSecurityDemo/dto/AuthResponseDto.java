package com.Learning.SpringSecurityDemo.dto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String accessToken;
    private String username;
    private String tokenType = "Bearer ";

    public AuthResponseDto(String accessToken, String username){
        this.accessToken = accessToken;
        this.username = username;
    }
}
