package com.table.tennis.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class MatchResultDto {
    private MatchDto match;
    private Integer winnerRegistrationId;
    private Integer numberOfSetsPlayed;
    private Boolean isOpponentRetired;

}
