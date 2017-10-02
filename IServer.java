
public interface IServer {
	/*
	 * logs user in and returns authToken. Throws login exceptions
	 */
	public int userLogin(String user, String password);
	/*
	 * Registers a new user and logs them in. Returns authToken
	 * Throws existingUser exception
	 */
	public int registerUser(String user, String password);
	/*
	 * creates a new game, using authToken to determine the creator. Returns gameID
	 */
	public int newGame(int authToken);
	/*
	 * adds authToken user to gameID game
	 */
	public void join(int authToken, int gameID);
	/*
	 * removes authToken user from gameID game
	 */
	public void leave(int authToken, int gameID);
	/*
	 * returns a list of the join-able games on the server
	 */
	public Object openGames();
	/*
	 * returns a list of in-progress games authToken user is currently in
	 */
	public Object inProgressGames(int authToken);
	/*
	 * returns a list of unstarted games authToken user is currently in
	 */
	public Object unstartedGames(int authToken);
	/*
	 * flags gameID game as started. Initializes game objects for gameID
	 */
	public void startGame(int gameID);

}
