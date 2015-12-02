package objects;

import java.util.List;

public class Room 
{
	private String name;
	private int id;
	private Room secretConnectedRoom;
	private List<Hallway> connectedHallways;
	private List<Character> occupants;
	//private List<Weapon> weapons;
		
	public Room()
	{
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void addOccupant() {
		
	}
	
	public void removeOccupant() {
		
	}
	
	public void addWeapon() {
		
	}
	
	public void removeWeapon() {
		
	}
	
	public void getConnectedLocations() {
		
	}
	
	public void getOccupants() {
		
	}
}
