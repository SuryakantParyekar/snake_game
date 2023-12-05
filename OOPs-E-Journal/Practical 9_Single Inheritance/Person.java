package person;

public class Person {
	private String name;
	private int age;
	private String address;
	
	
	public Person ()
	{
		this.name = "";
		this.age = 0;
		this.address = "";
		
	}
	
	public void enterDetails(String name ,int age ,String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void display()
	{
		System.out.print("Name: " + this.name + ",\nAge: " + this.age + ",\nAddress: " + this.address);
	}
}

