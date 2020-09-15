package com.dbstustdio.search.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbstustdio.search.entities.Genre;

public interface GenreRepository extends JpaRepository <Genre,Long> {

}
