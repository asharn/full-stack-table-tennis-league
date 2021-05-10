package com.table.tennis.model.dto;

import lombok.Data;

@Data
public class SetScoreDto {
    private MatchDto match;
    private Integer setNumber;
    private Integer firstRegistrationGames;
    private Integer secondRegistrationGames;
}
