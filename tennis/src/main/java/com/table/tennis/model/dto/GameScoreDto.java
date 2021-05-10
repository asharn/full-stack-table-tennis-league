package com.table.tennis.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class GameScoreDto {
    private MatchDto match;
    private Integer setNumber;
    private Integer gameNumber;
    private Integer firstRegistrationPoint;
    private Integer secondRegistrationPoint;

}
