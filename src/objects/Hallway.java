package objects;

import java.util.List;

public class Hallway implements Location 
{ 
	int id; 
	String name;
	boolean isOccupied;
	List<Location> connectedRooms;
	private List<Character> occupant;  
		

	public Hallway( int id ) 
	{ 
		this.id = id; 
	} 
	 
	public List<Character> getOccupants() { 
		return occupant; 
	} 

	public void addOccupant(Character character){
		occupant.add(character);
	}

	public void removeOccupant(Character character){
		occupant.remove(character);
	}

	public List<Location> getConnectedLocations(){
		return connectedRooms;
	}
} 
