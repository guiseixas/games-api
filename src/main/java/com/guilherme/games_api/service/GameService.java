package com.guilherme.games_api.service;

import com.guilherme.games_api.dto.GameMinDTO;

import java.util.List;

public interface GameService {
    public List<GameMinDTO> findAll();
}
