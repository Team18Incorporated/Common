package com.example.abram.phase1main.Results;

/**
 * Created by abram on 9/18/2017.
 */

public class CommandResult {

    protected String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CommandResult(String m)
    {
        message = m;
    }

    public CommandResult(){}
}
