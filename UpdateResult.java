package com.example.abram.phase1main.Results;

import com.example.abram.phase1main.ModelClasses.GameList;

/**
 * Created by abram on 10/9/2017.
 */

public class UpdateResult {
    private GameList gameList;
    private String message;

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gl) {
        gameList = gl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UpdateResult(GameList gl, String m)
    {
        gameList = gl;
        message = m;
    }
}
