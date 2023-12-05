package activity;

public class Activity {
	protected int Activity_Code;
	protected String Activity_Name;
	
	public Activity()
	{
		this.Activity_Code = 0;
		this.Activity_Name = "";
	}
	
	public void setDetails(int Activity_Code, String Activity_Name)
	{
		this.Activity_Code = Activity_Code;
		this.Activity_Name = Activity_Name;
	}
	
	public void display()
	{
		System.out.println("Activity Code: " + this.Activity_Code + ", Activity Name: " + this.Activity_Name);
	}
}
