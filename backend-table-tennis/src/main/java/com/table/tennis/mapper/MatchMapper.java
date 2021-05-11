package com.table.tennis.mapper;

import com.table.tennis.model.dto.MatchDto;
import com.table.tennis.model.entity.Match;
import org.mapstruct.Mapper;

/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Mapper(componentModel="spring")
public abstract class MatchMapper implements EntityDtoMapper<Match, MatchDto> {

}
