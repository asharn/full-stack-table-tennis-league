package com.match.tt.dto;

import lombok.Data;

@Data
public class TournamentPlayingCategoryDto {
    private Long id;
    private TournamentDto tournamentId;
    private PlayingCategoryDto playingCategoryId;
}
