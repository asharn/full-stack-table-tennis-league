package com.table.tennis.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.table.tennis.model.entity.MatchResult;
import lombok.Data;

import java.util.List;

/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class MatchDto {
    private Integer id;
    private TournamentPlayingCategoryDto tournamentPlayingCategory;
    private RegistrationDto firstRegistrationId;
    private RegistrationDto secondRegistrationId;
    private Integer round;
}
