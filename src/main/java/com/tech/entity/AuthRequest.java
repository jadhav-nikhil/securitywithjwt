package com.tech.entity;

import lombok.Data;

@Data
public class AuthRequest {
    private String userName;
    private String password;
}
