package com.match.tt.dto;

import lombok.Data;

@Data
public class MatchResultDto {
    private Long matchId;
    private Long winnerRegistrationId;
    private Long numberRegistrationId;
    private Boolean isOpponentRetired;

}
