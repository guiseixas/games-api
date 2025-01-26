package com.guilherme.games_api.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "belongings")
@NoArgsConstructor
@Getter
@Setter
public class Belonging {

    @EmbeddedId
    private BelongingPK id;

    private Integer position;

    public Belonging(Game game, GameList gamelist, Integer position) {
        this.id = new BelongingPK();
        this.id.setGame(game);
        this.id.setGameList(gamelist);
        this.position = position;
    }
}
