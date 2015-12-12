package objects;
import java.util.List;


public class Player extends BaseObject
{
	public Character character;
	public Location location;
	public List<Card> cards;
	public boolean isOutOfGame;
	
	public Player( Character character )
	{
		super();
		this.character = character;
	}
	
	public Player( Character character, List<Card> cards )
	{
		super(character.getId(), character.getName());
		this.character = character;
		this.cards = cards;
	}
}
