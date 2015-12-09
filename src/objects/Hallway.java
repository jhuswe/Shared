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

	public Character addOccupant(character){
		occupant.add(character);
	}

	public Character removeOccupant(character){
		occupant.remove(character);
	}

	public List<Location> getConnectedLocations(){
		return connectedRooms;
	}
} 
