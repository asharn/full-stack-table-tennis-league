package com.table.tennis.model.dto;

import lombok.Data;

@Data
public class TournamentPlayingCategoryDto {
    private Integer id;
    private TournamentDto tournament;
    private PlayingCategoryDto playingCategory;
}
