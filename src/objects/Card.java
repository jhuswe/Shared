package objects;

public enum Card
{
	// Rooms
	STUDY( 1 ),
	HALL( 2 ),
	LOUNGE( 3 ),
	LIBRARY( 4 ),
	BILLIARD( 5 ),
	DINING( 6 ),
	CONSERVATORY( 7 ),
	BALL( 8 ),
	KITCHEN( 9 ),
	
	// Hallways
	STUDY_HALL( 10 ),
	HALL_LOUNGE( 11 ),
	STUDY_LIBRARY( 12 ),
	HALL_BILLIARD( 13 ),
	LOUNGE_DINING( 14 ),
	LIBRARY_BILLIARD( 15 ),
	BILLIARD_DINING( 16 ),
	LIBRARY_CONSERVATORY( 17 ),
	BILLIARD_BALL( 18 ),
	DINING_KITCHEN( 19 ),
	CONSERVATORY_BALL( 20 ),
	BALL_KITCHEN( 21 ),
	
	// Characters
	MISS_SCARLET( "Miss Scarlet", 22 ),
	COL_MUSTARD( "Col. Mustard", 23 ),
	MRS_WHITE( "Mrs. White", 24 ),
	MR_GREEN( "Mr. Green", 25 ),
	PROF_PLUM( "Prof. Plum", 26 ),
	MRS_PEACOCK( "Mrs. Peacock", 27 ),
	
	// Weapons
	KNIFE( 28 ),
	CANDLE_STICK( 29 ),
	ROPE( 30 ),
	LEAD_PIPE( 31 ),
	WRENCH( 32 ),
	REVOLVER( "Revolver", 33 );
	
	private final int id;
	private String name;
	
	private Card( int id ) { this.id = id; }
	
	// Can assign text to the enum if needed to
	private Card( String name, int id )
	{
		this.name = name;
		this.id = id;
	}
	
	public int value() { return id; }
	
	public String getName() { return name; };
	
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
