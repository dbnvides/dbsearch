package com.dbstustdio.search.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbstustdio.search.entities.Game;

public interface GameRepository extends JpaRepository <Game,Long> {

}
