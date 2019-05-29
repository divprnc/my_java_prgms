import java.io.*;
class Bank implements Serializable 
{
	static double minBalance = 5000;
	int accNo;
	String name;
	String usrName;
	transient String password;
	transient double balance;
	void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	int getAccNo()
	{
		return accNo;
	}
	void setAccHoldName(String name)
	{
		this.name = name;
	}
	String getAccHoldName()
	{
		return name;
	}
	void setAccUserName(String usrName)
	{
		this.usrName = usrName;
	}
	String getAccUserName()
	{
		return usrName;
	}
	void setPassword(String password)
	{
		this.password = password;
	}
	String getPassword()
	{
		return password;
	}
	void setBalance(double balance)
	{
		this.balance = balance;
	}
	double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "Account Number: " + accNo + "\n" +
					"Account Holder Name: " + name + "\n" +
					"Account User Name: " + usrName + "\n" +
					"Account Password: " + password + "\n" +
					"Account Balance: " + balance + "\n" +
					"Account Minimum Balance: " + minBalance + "\n";
	}
}