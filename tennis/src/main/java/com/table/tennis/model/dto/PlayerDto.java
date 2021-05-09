package com.table.tennis.model.dto;


import java.util.Date;


import lombok.Data;

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
