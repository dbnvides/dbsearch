package com.dbstustdio.search.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbstustdio.search.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository <Record,Long> {

}
