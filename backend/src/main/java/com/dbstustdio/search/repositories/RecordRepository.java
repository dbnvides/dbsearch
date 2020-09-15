package com.dbstustdio.search.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbstustdio.search.entities.Record;

public interface RecordRepository extends JpaRepository <Record,Long> {

}
