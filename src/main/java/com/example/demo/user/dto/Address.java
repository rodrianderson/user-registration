package com.example.demo.user.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Address {

    private String street;

    private Integer number;

    private String complement;

    private String neighborhood;

    private String city;

    private String state;

    private String zipCode;

}
