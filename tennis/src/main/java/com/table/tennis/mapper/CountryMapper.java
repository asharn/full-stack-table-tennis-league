package com.table.tennis.mapper;

import com.table.tennis.model.dto.CountryDto;
import com.table.tennis.model.entity.Country;
import org.mapstruct.Mapper;

@Mapper
abstract class CountryMapper extends EntityDtoMapper<Country, CountryDto>{
}
