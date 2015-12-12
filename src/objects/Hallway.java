package objects;

import java.util.ArrayList;
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
		this.name = Card.getCard(id).getName();
		this.isOccupied = false;
		this.connectedRooms = new ArrayList<Location>();
		this.occupant = new ArrayList<Character>();
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
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId( int id ) {
		this.id = id;
	}
	
	public void setOccupied( boolean isOccupied ) {
		this.isOccupied = isOccupied;
	}
	
	public boolean isOccupied() {
		return this.isOccupied;
	}
	
	public void addConnectedRoom(Room room) {
		this.connectedRooms.add(room);
	}
} 
