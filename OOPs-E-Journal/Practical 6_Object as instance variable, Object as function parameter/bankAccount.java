package bankProject;

public class bankAccount {
	private int accountNumber;
	private int balance;
	
	public bankAccount( int accountNumber)
	{
		this.accountNumber = accountNumber;
		this.balance = 1000;
	}
	
	public void deposit( int amount)
	{
		this.balance += amount;
	}
	
	public void withDraw( int amount)
	{
		if (amount <= this.balance)
		{
			System.out.print(amount + " has be withdrawn");
			this.balance -= amount;
		}
		else
		{
			System.out.print("Insufficent Balance");
		}
	}
	
	public int bankBalance()
	{
		return this.balance;
	}
	
	public void transfer( int amount, bankAccount targetAccount)
	{
		if(amount <= this.balance)
		{
			this.balance -= amount;
			targetAccount.balance += amount;
		}
		else
		{
			System.out.print("Insufficent Balance to transfer");
		}
	}

}
