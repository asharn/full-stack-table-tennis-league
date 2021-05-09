package com.table.tennis.model.entity;

import lombok.Data;

@Data
public class SetScore {
    private Match matchId;
    private Long setNumber;
    private Long firstRegistrationGame;
    private Long secondRegistrationGame;
}
