package account;
import java.util.Scanner;

public class Start_Up_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account A;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press\n1: Saving Account \n2: Fixed Account");
		int choice = sc.nextInt();
		if(choice == 1) A = new Saving_Account(1,2000,"Sankhali",4);
		else A = new Fixed_Account(1,2000,"Sankhali",4,10);
		A.Display();
	}
}