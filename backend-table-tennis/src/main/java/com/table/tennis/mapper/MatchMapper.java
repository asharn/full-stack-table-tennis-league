package com.table.tennis.mapper;

import com.table.tennis.model.dto.MatchDto;
import com.table.tennis.model.entity.Match;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public abstract class MatchMapper implements EntityDtoMapper<Match, MatchDto> {

}
