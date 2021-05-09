package com.match.tt.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Player {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Character gender;
    private Date dateOfBirth;
    private Country code;

}
