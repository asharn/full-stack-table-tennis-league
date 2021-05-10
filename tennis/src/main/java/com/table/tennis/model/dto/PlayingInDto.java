package com.table.tennis.model.dto;



import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PlayingInDto {

    private Integer id;
    private RegistrationDto registration;
    private Integer seed;
    private TournamentPlayingCategoryDto tournamentPlayingCategory;
}
