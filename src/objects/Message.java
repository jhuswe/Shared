package objects;

import java.util.*;

@SuppressWarnings("serial")
public class Message implements java.io.Serializable {
	public int playerId;
	public int actionId;
	public int characterId;
	public List<Integer> guessInfo;
	public List<Location> availableMoves;
	public List<Location> playerLocations;
	public Action action;
}
