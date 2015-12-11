package objects;

import java.util.*;

@SuppressWarnings("serial")
public class Message implements java.io.Serializable {
	public int playerId;
	public List<Integer> suggestionInfo;
	public List<Location> availableMoves;
	public List<Location> playerLocations;
	public Action action;
	public Card character;
}
