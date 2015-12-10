package objects;

import java.util.*;

public interface Location {
	//will need to ensure that all locations can return a list of occupants
	public List<Character> getOccupants();
	public List<Location> getConnectedLocations();
	public int getId();
	public String getName();
}
