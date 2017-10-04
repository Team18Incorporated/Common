package com.example;

/**
 * Created by abram on 9/16/2017.
 */

public interface iCommand {


    public Command_Result execute();

    public String getText();

    public void setText(String t);

    public String getType();

    public void setType(String t);

}
