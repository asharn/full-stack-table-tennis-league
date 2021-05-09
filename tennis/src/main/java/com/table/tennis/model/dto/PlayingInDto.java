package com.table.tennis.model.dto;



import lombok.Data;

@Data
public class PlayingInDto {

    private Long id;
    private Long registrationId;
    private Long seed;
    private Long tournamentPlayingCategoryId;
}
