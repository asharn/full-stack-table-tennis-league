package com.table.tennis.mapper;

/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
public interface EntityDtoMapper<ENT, DTO>{
    DTO toDTO(ENT ent);
    ENT toEntity(DTO dto);
}
