package com.guilherme.games_api.controller;

import com.guilherme.games_api.dto.GameMinDTO;
import com.guilherme.games_api.entity.Game;
import com.guilherme.games_api.service.impl.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameServiceImpl gameService;

    @GetMapping
    public List<GameMinDTO> findAll()
    {
        return this.gameService.findAll();
    }
}
