package composition;

public class Student {

	Person p;
	int rollNo;
	
	Student(String name, int age, int rollNo)
	{
		p = new Person(name, age);
		this.rollNo = rollNo;
	}
	
	public void output()
	{
		p.displayDetails();
		System.out.println(" , RollNo : " + this.rollNo);
	}
}
