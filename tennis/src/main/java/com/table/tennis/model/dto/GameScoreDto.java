package com.table.tennis.model.dto;

import lombok.Data;

@Data
public class GameScoreDto {
    private MatchDto match;
    private Integer setNumber;
    private Integer gameNumber;
    private Integer firstRegistrationPoint;
    private Integer secondRegistrationPoint;

}
