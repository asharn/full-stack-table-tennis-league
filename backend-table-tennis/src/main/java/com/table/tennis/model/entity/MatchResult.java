package com.table.tennis.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Entity
public class MatchResult  implements Serializable {
    @ManyToOne
    @JoinColumn(name = "match_id")
    @Id
    private Match match;
    private Integer winnerRegistrationId;
    private Integer numberOfSetsPlayed;
    @Column(name = "is_opponent_retired", columnDefinition = "TINYINT(1)", nullable = false)
    private Boolean isOpponentRetired;

}
