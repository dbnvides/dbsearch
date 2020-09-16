package com.dbstustdio.search.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbstustdio.search.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository <Genre,Long> {

}
