package com.match.tt.entity;

import lombok.Data;

@Data
public class TieBreaker {
    private Match matchId;
    private Long setNumber;
    private Long firstRegistrationTieBreaker;
    private Long secRegistrationTieBreaker;
}
