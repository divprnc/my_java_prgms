import java.io.*;
class BankUser 
{
	public static void main(String[] args) 
	{
		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("AccountInfo.ser"));
			Bank accDetails = (Bank)ois.readObject();
			System.out.println(accDetails);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}