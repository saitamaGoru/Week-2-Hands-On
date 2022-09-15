package wk2session2ex3;

public class Account 
{
	private String name;
	private double balance;
	
	public Account(String name, double balance)
	{
		this.name = name;
		if(balance>0.0)
			this.balance = balance;
	}
	
	public void deposit(double depositAmount)
	{
		if(depositAmount>0.0)
			balance +=  depositAmount;
	//	depositAmount > 0 ? balance+=depositAmount:0; 
	}
	
	public void withdraw(double withdrawAmount)
	{
		if(withdrawAmount > balance)
			return;
		//(withdrawAmount > balance) ? return; //do not withdraw just exit
		if(withdrawAmount>0.0)
			balance -=withdrawAmount;
		
		//(withdrawAmount > 0.0) ? balance -= withdrawAmount; 
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}
