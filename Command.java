package com.example;

/**
 * Created by abram on 9/18/2017.
 */

public class Command implements iCommand {
    protected String type;
    protected String text;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Command(String ty, String t)
    {
        type = ty;
        text = t;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Command(){}

    public Command_Result execute()
    {
        return null;
    }
}
