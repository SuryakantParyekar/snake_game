package july_26_student;

public class Student {
	private int RollNo;
	private String Name;
	private static int Count=0;
	
	public Student (int RollNo , String Name)
	{
		this.RollNo=RollNo;
		this.Name=Name;
		Count++;
	}
	
	public static void Display()
	{
		System.out.println("Count=" + Count);
	}

}
