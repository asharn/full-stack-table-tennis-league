package com.table.tennis.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;

@Data
@Entity
@Table(
        name = "set_score",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"match_id","set_number"})}
)
public class SetScore  implements Serializable {
    @ManyToOne
    @JoinColumn(name = "match_id")
    @Id
    private Match match;
    @Id
    @Column(name = "set_number")
    private Integer setNumber;
    private Integer firstRegistrationGames;
    private Integer secondRegistrationGames;
}
