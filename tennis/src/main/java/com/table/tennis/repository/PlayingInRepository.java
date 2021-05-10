package com.table.tennis.repository;

import com.table.tennis.model.entity.PlayingIn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayingInRepository extends CrudRepository<PlayingIn,Long> {
    List<PlayingIn> findAll();
}
