package com.example.demo.user.dto;

import com.example.demo.user.enums.UserRoleEnum;

public record RegisterDTO(String login, String password, UserRoleEnum role) {
}
