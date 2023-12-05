package bankProject;
import java.util.*;

public class StartBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		bankAccount a1 = new bankAccount(1208);
		bankAccount a2 = new bankAccount(13);
		int input = 0;
		do
		{
			System.out.print("0: Exit\n1: Deposit\n2: Withdraw\n3: Bank Balance\n4: Transfer\nEnter Number : ");
			input = sc.nextInt();
			switch(input)
			{
			case 0: System.out.println("Exited");
					break;
			case 1: System.out.print("Enter Amount : ");
					int amount = sc.nextInt();
					a1.deposit(amount);
					System.out.println("a1 Bank Balance : " + a1.bankBalance());
					break;
			case 2: System.out.print("Enter Amount : ");
					amount = sc.nextInt();
					a1.withDraw(amount);
					System.out.println("a1 Bank Balance : " + a1.bankBalance());
					break;
			case 3: System.out.println("a1 Bank Balance : " + a1.bankBalance());
					break;
			case 4: System.out.print("Enter Amount : ");
					amount = sc.nextInt();
					a1.transfer(amount,a2);
					System.out.println("a1 Bank Balance : " + a1.bankBalance() +  "\na2 Bank Balance : " + a2.bankBalance() + "\n");
					break;
			
			}
		}while(input != 0);
	}
 
}