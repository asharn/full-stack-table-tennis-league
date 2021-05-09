package com.match.tt.dto;

import com.match.tt.entity.Match;

import lombok.Data;

@Data
public class SetScoreDto {
    private MatchDto matchId;
    private Long setNumber;
    private Long firstRegistrationGame;
    private Long secondRegistrationGame;
}
