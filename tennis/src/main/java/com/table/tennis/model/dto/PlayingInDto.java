package com.table.tennis.model.dto;



import com.table.tennis.model.entity.Registration;
import com.table.tennis.model.entity.TournamentPlayingCategory;
import lombok.Data;

@Data
public class PlayingInDto {

    private Integer id;
    private RegistrationDto registration;
    private Integer seed;
    private TournamentPlayingCategoryDto tournamentPlayingCategory;
}
