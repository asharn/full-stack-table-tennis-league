package com.table.tennis.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Entity
public class Match  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "tournament_playing_category_id")
    private TournamentPlayingCategory tournamentPlayingCategory;
    private Integer firstRegistrationId;
    private Integer secondRegistrationId;
    private Integer round;
}
