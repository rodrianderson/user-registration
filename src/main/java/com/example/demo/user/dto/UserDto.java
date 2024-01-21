package com.example.demo.user.dto;

import com.example.demo.user.enums.UserStatusEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    private String cpf;
    private String name;
    private Date dateBirth;
    private Address address;

    public UserDto(String cpf, String name, Date dateBirth, Address address) {
        this.cpf = cpf;
        this.name = name;
        this.dateBirth = dateBirth;
        this.address = address;
    }

}
