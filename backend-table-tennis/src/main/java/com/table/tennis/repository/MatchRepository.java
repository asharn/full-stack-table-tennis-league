package com.table.tennis.repository;

import com.table.tennis.model.entity.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Copyright 2021 @asharn
 * @author Ashish Karn
 * @updated_at 2021-05-10T22:21:53+0530
 * @created_at 2021-05-10T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Repository
public interface MatchRepository extends CrudRepository<Match,Long> {
    List<Match> findAll();
    List<Match> findAllByRound(Integer round);
}
