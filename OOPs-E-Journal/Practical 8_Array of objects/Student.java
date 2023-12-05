package array_1st;
//import javax.swing.JOptionPane;

public class Student {
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void Dispaly()
	{
		//JOptionPane.showMessageDialog(null, "Roll No.: " + this.rollNo + ", Name.: " + this.name);
		System.out.println("Roll No.: " + this.rollNo + ", Name.: " + this.name);
	}
}
