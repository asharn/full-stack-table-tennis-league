package com.match.tt.entity;

@Data
public class MatchResult {
    private Long matchId;
    private Long winnerRegistrationId;
    private Long numberRegistrationId;
    @Convert(converter=BooleanToStringConverter.class)
    private Boolean isOpponentRetired;

}
