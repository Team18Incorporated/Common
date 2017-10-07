package edu.byu.cs.team18.tickettoride;

import java.util.ArrayList;



public class GameInfo {

    private int gameID;
    private int numPlayers;
    private ArrayList<Player> playerList;
    private ArrayList<String> playerNames;

    //CONSTRUCTOR-----------------------------------------------------------------------------------

    public GameInfo(int gameID, List<Player> playerList) {
        this.gameID = gameID;
        this.playerList=playerList;
        numPlayers=this.playerList.size();
        for(int i=0; i<numPlayers; i++)
        {
            playerNames.add(this.playerList.get(i).getPlayerName());
        }
    }

    //METHODS---------------------------------------------------------------------------------------
    public int getNumPlayers() {
        return numPlayers;
    }

    public ArrayList<String> getPlayerNames() {
        return playerNames;
    }
}
