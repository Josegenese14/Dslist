package com.projetodslist.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodslist.br.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
