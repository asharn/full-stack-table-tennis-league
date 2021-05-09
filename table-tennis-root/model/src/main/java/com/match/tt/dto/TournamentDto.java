package com.match.tt.dto;

import com.match.tt.entity.SurfaceType;

import java.util.Date;

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
