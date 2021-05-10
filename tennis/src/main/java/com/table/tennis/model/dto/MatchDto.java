package com.table.tennis.model.dto;

import lombok.Data;

@Data
public class MatchDto {
    private Integer id;
    private TournamentPlayingCategoryDto tournamentPlayingCategory;
    private Integer firstRegistrationId;
    private Integer secondRegistrationId;
    private Integer round;
}
