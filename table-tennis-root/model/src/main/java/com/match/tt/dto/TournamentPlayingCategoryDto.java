package com.match.tt.dto;

import com.match.tt.entity.PlayingCategory;
import com.match.tt.entity.Tournament;

@Data
public class TournamentPlayingCategoryDto {
    private Long id;
    private TournamentDto tournamentId;
    private PlayingCategoryDto playingCategoryId;
}
