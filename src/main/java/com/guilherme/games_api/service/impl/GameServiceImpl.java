package com.guilherme.games_api.service.impl;

import com.guilherme.games_api.dto.GameMinDTO;
import com.guilherme.games_api.repository.GameRepository;
import com.guilherme.games_api.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public List<GameMinDTO> findAll() {
        var games = this.gameRepository.findAll();
        return games.stream().map(GameMinDTO::new).toList();
    }
}
