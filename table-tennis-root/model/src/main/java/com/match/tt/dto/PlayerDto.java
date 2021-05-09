package com.match.tt.dto;


import java.util.Date;


@Data
public class PlayerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Character gender;
    private Date dateOfBirth;
    private CountryDto code;

}
