package com.example.demo.user.enums;

public enum UserStatusRecordEnum {

    CREATE(1),
    UPDATE(0),

    REMOVE(0);

    private Integer status;

    UserStatusRecordEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
}
