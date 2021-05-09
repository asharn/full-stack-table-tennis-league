package com.table.tennis.model.entity;

import lombok.Data;

@Data
public class MatchResult {
    private Long matchId;
    private Long winnerRegistrationId;
    private Long numberRegistrationId;
    private Boolean isOpponentRetired;

}
