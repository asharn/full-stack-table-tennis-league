package com.match.tt.entity;

import java.util.Date;

@Data
public class Tournament {
    private Long id;
    private String tournamentName;
    private String location;
    private Date startDate;
    private Date endDate;
    private Integer numberOfRounds;
    private Long tournamentTypeId;
    private SurfaceType surfaceTypeId;
}
