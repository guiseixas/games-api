package com.guilherme.games_api.dto;

import com.guilherme.games_api.entity.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer releaseYear;
    private Double score;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.releaseYear = game.getReleaseYear();
        this.score = game.getScore();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }
}
