package account;

public class Account {

	protected int accountNo;
	protected int balance;
	protected String branch;
	protected int interestRate;
	
	public Account(int accountNo, int balance, String branch, int interestRate)
	{
		this.accountNo = accountNo;
		this.balance = balance;
		this.branch = branch;
		this.interestRate = interestRate;
	}
	
	public Account()
	{
		this.accountNo = 0;
		this.balance = 0;
		this.branch = "";
		this.interestRate = 0;
	}
	
	public void Display()
	{
		System.out.println("Account No.: " + this.accountNo + "\nBalance.: " + this.balance + "\nBranch.: " + this.branch + "\nInterest Rate.: " + this.interestRate + "%");
	}
}
