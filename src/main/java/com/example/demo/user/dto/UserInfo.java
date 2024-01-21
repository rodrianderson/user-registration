package com.example.demo.user.dto;

import com.example.demo.user.enums.UserStatusRecordEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class UserInfo {

    @Column(insertable = false, updatable = false)
    private String name;
    private UserStatusRecordEnum userRecord;
    private Date registerDate;

}
