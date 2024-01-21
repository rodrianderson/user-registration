package com.example.demo.user.entity;

import com.example.demo.user.dto.Address;
import com.example.demo.user.dto.UserInfo;
import com.example.demo.user.enums.UserStatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private UserStatusEnum status;

    @Embedded
    private UserInfo userInfo;
}
