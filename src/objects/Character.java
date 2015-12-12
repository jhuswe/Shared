package objects;

import java.awt.Color;

public class Character extends BaseObject
{
	public Color color;
	
	public Character( int id )
	{
		super(id, Card.getCard( id ).getName());
		
		if( id == Card.COL_MUSTARD.value() )
			this.color = Color.YELLOW;
		
		if( id == Card.MISS_SCARLET.value() )
			this.color = Color.RED;
		
		if( id == Card.MR_GREEN.value() )
			this.color = Color.GREEN;
		
		if( id == Card.PROF_PLUM.value() )
			this.color = new Color( 127, 0, 255);
		
		if( id == Card.MRS_PEACOCK.value() )
			this.color = Color.BLUE;
		
		if( id == Card.MRS_WHITE.value() )
			this.color = Color.WHITE;
	}
}
