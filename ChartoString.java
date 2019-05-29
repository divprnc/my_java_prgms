import java.util.Scanner;
class ChartoString 
{
	static int len, count;
	static int ulength(String s)
	{
		try
		{
			for ( int i = 0; 0<=i; i++)
			{
				s.charAt(i);
				count++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{}
		return count;
	} 
	static String ureverse(String s)
	{
		String rev = "";
		try
		{
			for ( int i = len - 1; i >= 0; i--)
			{
				rev += s.charAt(i);
			}			
		}
		catch (StringIndexOutOfBoundsException e )
		{}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string:");
		String s1 = scn.nextLine();
		String s2;
		len = ChartoString.ulength(s1);
		System.out.println("Length is:" + len);
		s2 = ChartoString.ureverse(s1);
		System.out.println(s2);
	}
}