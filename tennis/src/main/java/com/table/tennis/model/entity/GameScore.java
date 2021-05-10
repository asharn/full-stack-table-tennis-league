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
        name = "game_score",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"match_id","set_number","game_number"})}
)
public class GameScore  implements Serializable {
    @ManyToOne
    @JoinColumn(name = "match_id")
    @Id
    private Match match;
    @Id
    @Column(name = "set_number")
    private Integer setNumber;
    @Id
    @Column(name = "game_number")
    private Integer gameNumber;
    private Integer firstRegistrationPoint;
    private Integer secondRegistrationPoint;

}
