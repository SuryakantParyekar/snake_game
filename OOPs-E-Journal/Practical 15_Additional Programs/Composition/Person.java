package composition;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void getDetails(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails()
	{
		System.out.print("Name : " + this.name + ", Age : " + this.age);
	}
}
