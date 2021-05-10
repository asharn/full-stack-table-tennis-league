package com.table.tennis.model.dto;


import java.util.Date;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PlayerDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Character gender;
    private Date dateOfBirth;
    private CountryDto country;

}
