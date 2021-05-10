package com.table.tennis.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "matches")
public class Match  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "tournament_playing_category_id")
    private TournamentPlayingCategory tournamentPlayingCategory;
    @ManyToOne
    @JoinColumn(name = "first_registration_id")
    private Registration firstRegistrationId;
    @ManyToOne
    @JoinColumn(name = "second_registration_id")
    private Registration secondRegistrationId;
    private Integer round;
}
