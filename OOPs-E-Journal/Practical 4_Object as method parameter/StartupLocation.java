package july_26;

public class StartupLocation {

	public static void main(String[] args) {
		Location SourceLocation= new Location();
		Location DestLocation= new Location(8,9);
		SourceLocation.Display();
		DestLocation.Display();
		SourceLocation.MoveTo(DestLocation);
		SourceLocation.Display();
		DestLocation.Display();
		
	}

}
