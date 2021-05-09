package com.match.tt.dto;


import lombok.Data;

@Data
public class TieBreakerDto {
    private MatchDto matchId;
    private Long setNumber;
    private Long firstRegistrationTieBreaker;
    private Long secRegistrationTieBreaker;
}
