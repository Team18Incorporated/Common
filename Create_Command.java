package com.example;

/**
 * Created by abram on 10/2/2017.
 */

public class Create_Command extends Command {

    public Create_Command(String ty, String t)
    {
        type = ty;
        text = t;
    }

    public Command_Result execute()
    {
        String s = StringProcessor.getStringProcessor().toLC(text);
        return new Command_Result(s);
    }
}
