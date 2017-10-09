package com.example.abram.phase1main.Results;

import com.example.abram.phase1main.ModelClasses.AuthToken;
import com.example.abram.phase1main.ModelClasses.GameInfo;

/**
 * Created by abram on 10/9/2017.
 */

public class JoinResult {

    private GameInfo gameInfo;
    private String message;

    public GameInfo getGameInfo() {
        return gameInfo;
    }

    public void setGameInfo(GameInfo gameInfo) {
        this.gameInfo = gameInfo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JoinResult(GameInfo g, String m)
    {
        gameInfo = g;
        message = m;
    }
}
