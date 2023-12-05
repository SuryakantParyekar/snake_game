package activity;

public class InternalActivity extends Activity{
	private String person_incharge;
	
	public InternalActivity(int Activity_Code, String Activity_Name, String person_incharge)
	{
		super.setDetails(Activity_Code, Activity_Name);
		this.person_incharge = person_incharge;
	}
	
	public void display()
	{
		System.out.println("Activity Code: " + super.Activity_Code + ", Activity Name: " + super.Activity_Name + ", Person Incharge: " + this.person_incharge);
	}
}
