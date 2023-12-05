package person;

public class Student extends Person{

	private int Rollno;
	private int Marks_Scored;
	private String Result;
	
	public Student ()
	{
		this.Rollno = 0;
		this.Marks_Scored= 0;
		this.Result="";
	}
	
	public void enterDetails(String name, int age, String address, int Rollno ,int Marks_Scored ,String Result)
	{
		super.enterDetails(name, age, address);
		this.Rollno = Rollno;
		this.Marks_Scored = Marks_Scored;
		this.Result = Result;
	}
	
	public void display()
	{
		super.display();
		System.out.println(",\nRollno: " + this.Rollno + ",\nMarks_Scored: " + this.Marks_Scored + ",\nResult: " + this.Result);
	}
}
