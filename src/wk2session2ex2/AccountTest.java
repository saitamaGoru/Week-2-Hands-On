package wk2session2ex2;

public class AccountTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account account1 = new Account("Jane",1000.00);
		Account account2 = new Account("Bob",50.95);
		//Display initial value of name for each account
		System.out.printf("Account1 name is: %s%n", account1.getName());
		System.out.printf("Account2 name is: %s%n", account2.getName());
		
		System.out.printf("Account2 name is: %f%n", account2.getBalance());
	}

}
