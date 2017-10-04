package com.example;

/**
 * Created by abram on 9/18/2017.
 */

public class Command_Result {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Command_Result(String m)
    {
        message = m;
    }
}
