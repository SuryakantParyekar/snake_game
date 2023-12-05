package activity;

public class ActivityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InternalActivity A1 = new InternalActivity(1,"Hackaton","Vaibhav");
		A1.display();
		
		ExternalActivity A2 = new ExternalActivity(2,"Running","GMC");
		A2.display();
	}
}
