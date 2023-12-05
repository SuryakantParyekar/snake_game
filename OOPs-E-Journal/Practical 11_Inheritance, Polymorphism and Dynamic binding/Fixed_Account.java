package account;

public class Fixed_Account extends Account{
	
	private int noOfDays;
	public Fixed_Account(int accountNo, int balance, String branch, int interestRate, int noOfDays)
	{
		super(accountNo, balance, branch, interestRate);
		this.noOfDays = noOfDays;
	}
	
	public void Display()
	{
		super.Display();
		System.out.print("No of years.: " + this.noOfDays);
	}
}
