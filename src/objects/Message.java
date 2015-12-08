package objects;

import java.util.*;

public class Message {
	int playerId;
	int actionId;
	int characterId;
	List<Integer> guessInfo;
	List<Location> availableMoves;
	List<Location> playerLocations;
	Action action;
}
