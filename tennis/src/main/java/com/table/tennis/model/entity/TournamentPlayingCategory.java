package com.table.tennis.model.entity;

import lombok.Data;

@Data
public class TournamentPlayingCategory {
    private Long id;
    private Tournament tournamentId;
    private PlayingCategory playingCategoryId;
}
