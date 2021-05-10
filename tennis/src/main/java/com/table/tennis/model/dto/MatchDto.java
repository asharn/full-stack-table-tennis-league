package com.table.tennis.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class MatchDto {
    private Integer id;
    private TournamentPlayingCategoryDto tournamentPlayingCategory;
    private RegistrationDto firstRegistrationId;
    private RegistrationDto secondRegistrationId;
    private Integer round;
}
