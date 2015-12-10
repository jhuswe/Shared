package objects;
import java.util.List;
import java.util.Set;


public class Player 
{
	public Character character;
	public Location location;
	public List<Card> cards;
	public boolean isOutOfGame;
	
	
	public Player()
	{
		this( null, null );
	}
	
	public Player( Character character, List<Card> cards )
	{
		this.character = character;
		this.cards = cards;
	}
}
