package theatreProject;
import javax.swing.JOptionPane;

public class StartTheatre {

	public static void main(String[] args) {
		Theatre t[] = new Theatre[3];
		for(int i=0; i<3; i++)
		{
			String name = JOptionPane.showInputDialog("Enter Name");
			String location = JOptionPane.showInputDialog("Enter Location");
			int capacity = Integer.parseInt(JOptionPane.showInputDialog("Enter Seat Capacity"));
			float rating = Float.parseFloat(JOptionPane.showInputDialog("Enter Rating"));
			t[i] = new Theatre(name,  location, capacity, rating);
		}
		
		for(int i=0; i<3; i++)
		{
			if(t[i].GetCapacity() > 200 && t[i].GetRating() > 3)
			{
				t[i].Details();
			}
		}
	}

}
