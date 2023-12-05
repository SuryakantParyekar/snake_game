package theatreProject;

public class Theatre {

	private String Tname;
	private String Tlocation;
	private int Capacity;
	private float Rating;
	
	public Theatre()
	{
		this.Tname = "";
		this.Tlocation = "";
		this.Capacity = 0;
		this.Rating = 0;
	}
	
	public Theatre(String Tname, String Tlocation)
	{
		this.Tname = Tname;
		this.Tlocation = Tlocation;
	}
	
	public Theatre(String Tname, String Tlocation, int Capacity, float Rating)
	{
		this.Tname = Tname;
		this.Tlocation = Tlocation;
		this.Capacity = Capacity;
		this.Rating = Rating;
	}
	
	public Theatre(String Tname)
	{
		this.Tname = Tname;
	}
	
	public int GetCapacity()
	{
		return this.Capacity;
	}
	
	public float GetRating()
	{
		return this.Rating;
	}
	
	public void SetCapacity(int Capacity)
	{
		this.Capacity = Capacity;
	}
	
	public void SetRating(float Rating)
	{
		this.Rating = Rating;
	}
	
	public void Details()
	{
		System.out.println("Name : " + this.Tname + "\nLocation : " + this.Tlocation +"\nCapacity : " + this.GetCapacity() + "\nRating : " + this.GetRating());

	}
}
