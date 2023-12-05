package july_26;

public class Location {
	private int xposition;
	private int yposition;
	
	public Location(int xposition, int yposition)
	{
		this.xposition = xposition;
		this.yposition = yposition;
	}
	
	public Location()
	{
		this.xposition = 0;
		this.yposition = 0;
	}
	
	public void MoveTo(Location pos)
	{
		this.xposition=pos.xposition;
		this.yposition=pos.yposition;
	}
	
	public void Display()
	{
		System.out.println("Position x=" + this.xposition + ", y=" + this.yposition);
	}
}
