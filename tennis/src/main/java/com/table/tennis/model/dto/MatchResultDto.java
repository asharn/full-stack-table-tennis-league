package com.table.tennis.model.dto;

import lombok.Data;

@Data
public class MatchResultDto {
    private MatchDto match;
    private Integer winnerRegistrationId;
    private Integer numberOfSetsPlayed;
    private Boolean isOpponentRetired;

}
