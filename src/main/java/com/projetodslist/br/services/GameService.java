package com.projetodslist.br.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projetodslist.br.dto.GameMinDTO;
import com.projetodslist.br.entities.Game;
import com.projetodslist.br.repositories.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDTO(x)).toList();
		 
	}

}
