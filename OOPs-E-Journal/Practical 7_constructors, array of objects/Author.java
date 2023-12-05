package array_2nd;

public class Author {
	private String aname;
	private String telephone;
	private String address;
	
	public Author(String aname, String telephone, String address)
	{
		this.aname = aname;
		this.telephone = telephone;
		this.address = address;
	}
	
	public void Display()
	{
		System.out.println("Author Name.: " + this.aname + ", Telephone.: " + this.telephone + ", Address.: " + this.address);
	}
}
