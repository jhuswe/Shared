package objects;

public enum Action 
{
	MOVE( 1 ),
	SUGGESTION( 2 ),
	ACCUSATION( 3 ),
	DISPROVE( 4 ),
	RECEIVE_DISPROVE_CARD( 5 ),
	WIN( 6 ),
	LOSE( 7 );
	
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
