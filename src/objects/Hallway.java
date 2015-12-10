package objects;

import java.util.ArrayList;
import java.util.List;

public class Hallway implements Location 
{ 
	public int id; 
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
		if( occupant == null )
			occupant = new ArrayList<Character>();
		occupant.add(character);
	}

	public void removeOccupant(Character character){
		occupant.remove(character);
	}

	public List<Location> getConnectedLocations(){
		return connectedRooms;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
} 
