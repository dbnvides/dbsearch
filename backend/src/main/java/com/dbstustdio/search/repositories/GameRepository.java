package com.dbstustdio.search.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbstustdio.search.entities.Game;

@Repository
public interface GameRepository extends JpaRepository <Game,Long> {

}
