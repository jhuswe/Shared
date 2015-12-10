package objects;

public abstract class BaseObject {
	private int id;
	private String name;
	
	public BaseObject() {
	}
	
	public BaseObject(int id, String name) {
		this.id = id;
		this.name = name;
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
