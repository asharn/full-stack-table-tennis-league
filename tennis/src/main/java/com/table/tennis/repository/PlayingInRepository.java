package com.table.tennis.repository;

import com.table.tennis.model.entity.PlayingIn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayingInRepository extends CrudRepository<PlayingIn,Long> {
}
