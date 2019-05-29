import java.io.*;
class BankTransaction 
{
	public static void main(String[] args) 
	{
		try
		{
			Bank acc1 = new Bank();
			acc1.setAccNo(101);
			acc1.setAccHoldName("Ashu Akash Singh");
			acc1.setAccUserName("Ashu");
			acc1.setPassword("Ashu123");
			acc1.setBalance(10000);
			System.out.println("Account Details.............");
			System.out.println(acc1);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("AccountInfo.ser"));
			oos.writeObject(acc1);			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}