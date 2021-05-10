package com.table.tennis.repository;

import com.table.tennis.model.entity.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends CrudRepository<Match,Long> {
    List<Match> findAll();
    List<Match> findAllByRound(Integer round);
}
