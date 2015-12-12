package objects;

public enum Action 
{
	MOVE( "Move", 1 ),
	MAKE_SUGGESTION( "Make Suggestion", 2 ),
	ACCUSATION( "Accusation", 3 ),
	DISPROVE( "Disprove", 4 ),
	RECEIVE_DISPROVE_CARD( "Receive Disprove Card", 5 ),
	WIN( "Win", 6 ),
	LOSE( "Lose", 7 ),
	INITIATE_CHARACTER( "Initiate Character", 8 ),
	SHOW_SUGGESTION( "Show Suggestion", 9 ),
	NO_DISPROVE_MADE( "No Disprove Made", 10 ),
	UPDATE_PLAYER_LOCATION( "Update Player Location", 11 );
	
	private final int id;
	private String name;
	
	private Action( int id ) { this.id = id; }
	
	private Action( String name, int id )
	{
		this.name = name;
		this.id = id;
	}
	
	public int value() { return id; }
	
	public String getName() { return name; }
	
	
	/*
	 * Test Action
	 */
//	public static void main (String a[])
//	{
//		for( Action act : Action.values() )
//		{
//			System.out.println( "Action's name " + act );
//			System.out.println( "Action's value " + act.value() );
//			System.out.println( "Action's value " + act.getName() );
//		}
//		Action act2 = Action.MOVE;
//		System.out.println( act2 + " " + act2.value() + " " + act2.getName() );
//	}
}
