package array_2nd;

public class Publisher {
	private String pname;
	private String telephone;
	
	public Publisher(String pname, String telephone)
	{
		this.pname = pname;
		this.telephone = telephone;
	}
	
	public void Display()
	{
		System.out.println("Publisher Name.: " + this.pname + ", Telephone.: " + this.telephone);
	}
}
