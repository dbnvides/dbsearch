package com.dbstustdio.search.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbstustdio.search.dto.RecordDTO;
import com.dbstustdio.search.dto.RecordInsertDTO;
import com.dbstustdio.search.entities.Game;
import com.dbstustdio.search.entities.Record;
import com.dbstustdio.search.repositories.GameRepository;
import com.dbstustdio.search.repositories.RecordRepository;


@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
		
	}
	
	
}
