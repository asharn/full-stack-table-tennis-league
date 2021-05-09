package com.match.tt.dto;

import lombok.Data;

@Data
public class GameScoreDto {
    private Long matchId;
    private Long setNumber;
    private Long gameNumber;
    private Long firstRegistrationPoint;
    private Long secondRegistrationPoint;

}
