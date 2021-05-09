package com.match.tt.entity;

import lombok.Data;

@Data
public class TournamentPlayingCategory {
    private Long id;
    private Tournament tournamentId;
    private PlayingCategory playingCategoryId;
}
