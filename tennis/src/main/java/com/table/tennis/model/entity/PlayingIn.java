package com.table.tennis.model.entity;


import lombok.Data;

@Data
public class PlayingIn {

    private Long id;
    private Long registrationId;
    private Long seed;
    private Long tournamentPlayingCategoryId;
}
