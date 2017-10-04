package edu.byu.cs.team18.tickettoride.Common;

import java.util.List;



public class Game {

    private List<Player> playerList;
    private String gameID; //could make ID's into something other than Strings
    private int status=0;  //We could change these to enums or something but I'm not super familiar with them so I just did ints for now
                            //0= being created  1=in lobby/waiting   2= started

    //CONSTRUCTOR-----------------------------------------------------------------------------------
    public Game(Player player1)
    {
        playerList.add(player1);
        status=1;
    }

    //METHODS---------------------------------------------------------------------------------------
    public boolean addPlayer(Player newPlayer)
    {
        if (playerList.size()<5)
        {
            playerList.add(newPlayer);
            return true;
        }
        else
        {
            return false;
        }
    }
}
