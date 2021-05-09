package com.match.tt.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TournamentDto {
    private Long id;
    private String tournamentName;
    private String location;
    private Date startDate;
    private Date endDate;
    private Integer numberOfRounds;
    private Long tournamentTypeId;
    private SurfaceTypeDto surfaceTypeId;
}
