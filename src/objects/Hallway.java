package objects;

import java.util.ArrayList;
import java.util.List;

public class Hallway implements Location 
{ 
	public int id; 
	String name;
	public boolean isOccupied;
	List<Location> connectedRooms;
	private List<Character> occupant;  
		

	public Hallway( int id ) 
	{ 
		this.id = id;
		this.name = Card.getCard(id).getName();
		isOccupied = false;
	} 
	 
	public List<Character> getOccupants() { 
		return occupant; 
	} 

	public void addOccupant(Character character){
		if( occupant == null )
			occupant = new ArrayList<Character>();
		occupant.add(character);
		this.isOccupied = true;
	}

	public void removeOccupant(Character character){
		occupant.remove(character);
		isOccupied = false;
	}

	public List<Location> getConnectedLocations(){
		return connectedRooms;
	}

	@Override
	public String getName() {
		return this.name;
	}
} 
