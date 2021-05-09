package com.table.tennis.model.dto;

import lombok.Data;

@Data
public class SetScoreDto {
    private MatchDto matchId;
    private Long setNumber;
    private Long firstRegistrationGame;
    private Long secondRegistrationGame;
}
