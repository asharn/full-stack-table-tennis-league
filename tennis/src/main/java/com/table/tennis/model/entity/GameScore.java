package com.table.tennis.model.entity;

import lombok.Data;

@Data
public class GameScore {
    private Long matchId;
    private Long setNumber;
    private Long gameNumber;
    private Long firstRegistrationPoint;
    private Long secondRegistrationPoint;

}
