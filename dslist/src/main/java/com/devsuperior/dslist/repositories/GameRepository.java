package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.entities.Game;

@Service
public interface GameRepository extends JpaRepository<Game, Long>{

	
}
