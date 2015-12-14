package objects;

public enum Card
{
	// Unknown
	UNKNOWN( "Uknown", -1 ),
	
	// Rooms
	STUDY( "Study", 1 ),
	HALL( "Hall", 2 ),
	LOUNGE( "Lounge", 3 ),
	LIBRARY( "Library", 4 ),
	BILLIARD( "Billiard", 5 ),
	DINING( "Dining Room", 6 ),
	CONSERVATORY( "Conservatory", 7 ),
	BALL( "Ballroom", 8 ),
	KITCHEN( "Kitchen", 9 ),
	
	// Hallways
	STUDY_HALL( "Study - Hall hallway", 10 ),
	HALL_LOUNGE( "Hall - Lounge hallway", 11 ),
	STUDY_LIBRARY( "Study - Library hallway", 12 ),
	HALL_BILLIARD( "Hall - Billiard hallway", 13 ),
	LOUNGE_DINING( "Lounge - Dining hallway", 14 ),
	LIBRARY_BILLIARD( "Library - Billiard hallway", 15 ),
	BILLIARD_DINING( "Billiard - Dining hallway", 16 ),
	LIBRARY_CONSERVATORY( "Library - Conservatory hallway", 17 ),
	BILLIARD_BALL( "Billiard - Ballroom hallway", 18 ),
	DINING_KITCHEN( "Dining - Kitchen hallway", 19 ),
	CONSERVATORY_BALL( "Conservatory - Ballroom hallway", 20 ),
	BALL_KITCHEN( "Ball - Kitchen hallway", 21 ),
	
	// Characters
	MISS_SCARLET( "Miss Scarlet", 22 ),
	COL_MUSTARD( "Col. Mustard", 23 ),
	MRS_WHITE( "Mrs. White", 24 ),
	MR_GREEN( "Mr. Green", 25 ),
	MRS_PEACOCK( "Mrs. Peacock", 26 ),
	PROF_PLUM( "Prof. Plum", 27 ),
	
	// Weapons
	KNIFE( "Knife", 28 ),
	CANDLE_STICK( "Candle Stick", 29 ),
	ROPE( "Rope", 30 ),
	LEAD_PIPE( "Lead Pipe", 31 ),
	WRENCH( "Wrench", 32 ),
	REVOLVER( "Revolver", 33 );
	
	private final int id;
	private String name;
	
	private Card( int id ) { this.id = id; }
	
	private Card( String name, int id )
	{
		this.name = name;
		this.id = id;
	}
	
	public int value() { return id; }
	
	/**
	 * Allow lookup for a card using Card ID number
	 */
	public static Card getCard( int id )
	{
		Card card = Card.UNKNOWN;
		for( Card c : values() )
		{
			if( id == c.value() )
				card = c;
		}
		return card;
	}
	
	/**
	 * Return the name of the card
	 */
	public String getName() { return name; };

	
	/*
	 * Test Card
	 */
//	public static void main (String a[])
//	{
//		Hallway hallway = new Hallway( Card.HALL.value() );
//		System.out.println( "card's name " + Card.HALL );
//		System.out.println( hallway.id );
//		for( Card card : Card.values() )
//		{
//			System.out.println( "card's enum " + card );
//			System.out.println( "card's id " + card.value() );
//			System.out.println( "card's name " + card.getName() );
//		}
//	}
	
}
