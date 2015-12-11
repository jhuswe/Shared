package objects;

public class Weapon extends BaseObject {
	public Weapon(int id) {
		super(id, Card.getCard(id).getName());
	}
}
