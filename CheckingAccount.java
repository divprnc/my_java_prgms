import java.util.Scanner;
class CheckingAccount
{
	private int acc_no;
	private double balance;
	void withdraw() throws InsufficientBalanceException
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		double amount = scn.nextDouble();
		if ( balance > amount)
			balance -= amount;
		else
		{
			double need = amount - balance;
			throw new InsufficientBalanceException(need);
		}
	}
	void deposit()
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the amount to deposit: ");
		double amount = scn.nextDouble();
		balance += amount;
	}
}