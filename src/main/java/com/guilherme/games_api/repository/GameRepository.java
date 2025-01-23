package com.guilherme.games_api.repository;

import com.guilherme.games_api.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
