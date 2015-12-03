package objects;

import java.util.*;

public class Hallway implements Location
{
	int id;
	//should only ever have one occupant but need to make this a list to be able to standardize getOccupants
	private List<Character> occupant; 
	
	public Hallway( int id )
	{
		this.id = id;
	}
	
	public List<Character> getOccupants() {
		return occupant;
	}
}
