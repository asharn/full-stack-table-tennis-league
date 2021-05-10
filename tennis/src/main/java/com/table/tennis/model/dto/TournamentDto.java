package com.table.tennis.model.dto;

import java.util.Date;

import com.table.tennis.model.entity.TournamentType;
import lombok.Data;

@Data
public class TournamentDto {
    private Integer id;
    private String tournamentName;
    private String location;
    private Date startDate;
    private Date endDate;
    private Integer numberOfRounds;
    private TournamentType tournamentType;
    private SurfaceTypeDto surfaceType;
}
