package com.table.tennis.model.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@Entity
public class Player  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Character gender;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    @ManyToOne
    @JoinColumn(name = "country_code")
    private Country country;

}
