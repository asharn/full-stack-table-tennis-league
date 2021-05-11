package com.table.tennis.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import java.io.Serializable;
/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Data
@Entity
public class MatchResult  implements Serializable {

    @EmbeddedId
    private MatchIdPK matchId;

    @OneToOne
    @JoinColumn(name = "match_id")
    @MapsId( "matchId" )
    private Match match;

    @ManyToOne
    @JoinColumn(name = "winner_registration_id")
    private Registration registration;

    private Integer numberOfSetsPlayed;

    @Column(name = "is_opponent_retired", columnDefinition = "TINYINT(1)", nullable = false)
    private Boolean isOpponentRetired;

}
