package com.match.tt.entity;

import lombok.Data;

@Data
public class Match {
    private Long id;
    private Long tournamentPlayingCategoryId;
    private Long firstRegistrationId;
    private Long secondRegistrationId;
    private Integer round;
}
