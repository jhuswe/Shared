package objects;

import java.util.*;

public class Room extends BaseObject implements Location 
{
//	private String name;
//	private int id;
	private Room secretConnectedRoom;
	private List<Hallway> connectedHallways;
	private List<Character> occupants;
	private List<Weapon> weapons;
			
	public Room(){
		super();
		initArrays();
	}
	
	public Room(int id, String name){
		super(id, name);
		initArrays();
	}
	
//	public String getName() {
//		return this.name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public int getId() {
//		return this.id;
//	}
//	
//	public void setId(int id) {
//		this.id = id;
//	}
	
	public void addOccupant(Character character) {
		this.occupants.add(character);
	}
	
	public void removeOccupant(Character character) {
		this.occupants.remove(character);
	}
	
	public void addWeapon(Weapon weapon) {
		this.weapons.add(weapon);
	}
	
	public void removeWeapon(Weapon weapon) {
		this.weapons.remove(weapon);
	}
	
	public List<Location> getConnectedLocations() {
		List<Location> connectedLocations = new ArrayList<Location>();
	
		for(Location location : connectedHallways) {
			connectedLocations.add(location);
		}
		
		if(secretConnectedRoom != null) {
			connectedLocations.add(secretConnectedRoom);
		}
		
		return connectedLocations;
	}
	
	public List<Character> getOccupants() {
		return this.occupants;
	}
	
	public void addSecretRoom(Room room) {
		this.secretConnectedRoom = room;
	}
	
	public Room getSecretRoom() {
		return this.secretConnectedRoom;
	}
	
	private void initArrays() {
		this.connectedHallways = new ArrayList<Hallway>();
		this.occupants = new ArrayList<Character>();
		this.weapons = new ArrayList<Weapon>();
	}
}
