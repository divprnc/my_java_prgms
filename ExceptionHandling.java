import java.util.Scanner;
class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		CheckingAccount ca = new CheckingAccount();
		ca.deposit();
		try
		{
			ca.withdraw();
		}
		catch (InsufficientBalanceException ie)
		{
			System.out.println("Sorry! Insufficient Balance");
			System.out.println("Your Balance lack from Rs. " + ie.getBalance());
		}
		finally
		{
			System.out.println("Your transaction is successful, Thank You.");
		}
	}
}