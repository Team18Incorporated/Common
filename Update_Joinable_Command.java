package com.example;

/**
 * Created by abram on 10/2/2017.
 */

public class Update_Joinable_Command {

    public Update_Joinable_Command(String ty, String t)
    {
        type = ty;
        text = t;
    }

    public Command_Result execute()
    {
        String s = Server_Facade.getStringProcessor().update_joinable();
        return new Command_Result(s);
    }
}
