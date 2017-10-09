package com.example.abram.phase1main.Commands;

import com.example.abram.phase1main.ModelClasses.AuthToken;
import com.example.abram.phase1main.Results.CommandResult;

/**
 * Created by abram on 10/2/2017.
 */

public class StartCommand {

    private String gameID;
    private AuthToken token;

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public AuthToken getToken() {
        return token;
    }

    public void setToken(AuthToken token) {
        this.token = token;
    }

    public StartCommand(String ID, AuthToken t)
    {
        gameID = ID;
        token = t;
    }

}
