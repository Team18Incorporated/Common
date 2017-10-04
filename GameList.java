package edu.byu.cs.team18.tickettoride.Common;

import java.util.List;



public class GameList {

    private List<Game> gameList;


    //CONSTRUCTOR ----------------------------------------------------------------------------------
    public GameList(){}


    //METHODS---------------------------------------------------------------------------------------
    public void addGame(Game newGame)
    {
        gameList.add(newGame);
    }
}
