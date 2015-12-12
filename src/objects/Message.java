package objects;

import java.util.*;

@SuppressWarnings("serial")
public class Message implements java.io.Serializable {
	public Player player;
	public List<Integer> suggestionAccusationInfo;
	public List<Location> availableMoves;
	public List<Location> playerLocations;
	public Action action;
	public Card character;
}
