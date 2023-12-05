package shapes;
import java.util.Scanner;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 : circle, 2 : Square, 3 : Rectangle ");
		int choice = sc.nextInt();
		if(choice == 1)
			s = new Circle();
		else if(choice == 2)
			s = new Square();
		else
			s = new Rectangle();
		s.enterInputs();
		s.area();
		s.perimeter();
		
		sc.close();
	}
}
