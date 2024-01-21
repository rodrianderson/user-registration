package com.example.demo.user.enums;

public enum UserStatusEnum {

    ATIVO(1),
    REMOVIDO(0);


    private Integer status;

    UserStatusEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
}
