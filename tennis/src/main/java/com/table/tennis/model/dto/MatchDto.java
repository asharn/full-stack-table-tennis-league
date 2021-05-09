package com.table.tennis.model.dto;

import lombok.Data;

@Data
public class MatchDto {
    private Long id;
    private Long tournamentPlayingCategoryId;
    private Long firstRegistrationId;
    private Long secondRegistrationId;
    private Integer round;
}