package array_1st;
import javax.swing.JOptionPane;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []s = new Student[10];
		for(int i=0; i<3; i++)
		{
			int rollNo = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll No"));
			String name = JOptionPane.showInputDialog("Enter Name");
			s[i] = new Student( rollNo, name);
		}
		
		for(int i=0; i<3; i++)
		{
			s[i].Dispaly();
		}
	}

}
