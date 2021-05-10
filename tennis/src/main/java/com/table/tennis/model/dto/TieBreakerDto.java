package com.table.tennis.model.dto;


import lombok.Data;

@Data
public class TieBreakerDto {
    private MatchDto match;
    private Integer setNumber;
    private Integer firstRegistrationTieBreaker;
    private Integer secRegistrationTieBreaker;
}
