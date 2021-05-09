package com.table.tennis.mapper;

public abstract class EntityDtoMapper<ENT, DTO>{
    public abstract DTO toDTO(ENT ent);
    public abstract ENT toEntity(DTO dto);
}
