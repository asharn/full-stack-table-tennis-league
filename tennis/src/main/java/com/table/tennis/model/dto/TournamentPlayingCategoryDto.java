package com.table.tennis.model.dto;

import lombok.Data;

@Data
public class TournamentPlayingCategoryDto {
    private Long id;
    private TournamentDto tournamentId;
    private PlayingCategoryDto playingCategoryId;
}
