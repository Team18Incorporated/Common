package edu.byu.cs.team18.tickettoride.Common;

import java.util.ArrayList;
import java.util.List;



public class GameList {

    private List<Game> gameList;


    //CONSTRUCTOR ----------------------------------------------------------------------------------
    public GameList()
    {
        gameList = new ArrayList<Game>();
    }


    //METHODS---------------------------------------------------------------------------------------

    /*addGame adds a Game to the GameList
    * @pre newGame cannot be null
    * @post adds newGame to gameList
    * */
    public void addGame(Game newGame)
    {
        gameList.add(newGame);
    }
}
