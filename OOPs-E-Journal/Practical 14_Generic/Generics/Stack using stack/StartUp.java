package genericStack;
import javax.swing.JOptionPane;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array[] = new Integer[1];
		Stack<Integer> s = new Stack<Integer>(array);
		int choice = 0;
		
		do {
			choice = Integer.parseInt(JOptionPane.showInputDialog( "Enter \n0: Stop \n1: Push \n2: pop \n3: Stack Top \n4: Display \n5: Empty"));
			switch(choice) 
			{
				case 1: Integer el = Integer.parseInt(JOptionPane.showInputDialog( "Enter Element"));
						s.push(el);
				break;
				case 2: s.pop();
				break;
				case 3: JOptionPane.showMessageDialog(null,"Top element is " + s.stackTop());
				break;
				case 4: JOptionPane.showMessageDialog(null, s.display());
				break;
				case 5: JOptionPane.showMessageDialog(null, s.empty());
			}
			
		} while(choice != 0);
	}

}
