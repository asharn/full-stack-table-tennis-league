package com.table.tennis.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TournamentPlayingCategoryDto {
    private Integer id;
    private TournamentDto tournament;
    private PlayingCategoryDto playingCategory;
}
