package com.example.abram.phase1main.Results;

/**
 * Created by abram on 10/7/2017.
 */



public class RegisterResult extends CommandResult{
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public RegisterResult(String s, String m)
    {
        message = m;
        token = s;
    }
}