package activity;

public class ExternalActivity extends Activity{
	private String collegeName;
	
	public ExternalActivity(int Activity_Code, String Activity_Name, String collegeName)
	{
		super.setDetails(Activity_Code, Activity_Name);
		this.collegeName = collegeName;
	}
	
	public void display()
	{
		System.out.println("Activity Code: " + super.Activity_Code + ", Activity Name: " + super.Activity_Name + ", College Name: " + this.collegeName);
	}
}
