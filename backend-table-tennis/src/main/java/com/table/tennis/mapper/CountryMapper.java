package com.table.tennis.mapper;

import com.table.tennis.model.dto.CountryDto;
import com.table.tennis.model.entity.Country;
import org.mapstruct.Mapper;


@Mapper
public abstract class CountryMapper implements EntityDtoMapper<Country, CountryDto> {
}
