class InsufficientBalanceException extends Exception
{
	double amount;
	InsufficientBalanceException(double amount)
	{
		this.amount = amount;
	}
	double getBalance()
	{
		return amount;
	}
}