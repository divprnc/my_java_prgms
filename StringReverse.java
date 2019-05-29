import java.util.Scanner;
class StringReverse 
{
	static int len, count;
	static int ulength(String s)
	{
		try
		{
			for ( int i = 0; 0 <= i; i++)
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
			for ( int i = len - 1; i >= 0; i--)
			{
				rev = rev + s.charAt(i);
			}			
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string:");
		String s1 = scn.nextLine();
		String s2;
		len = StringReverse.ulength(s1);
		System.out.println("Length is:" + len);
		s2 = StringReverse.ureverse(s1);
		System.out.println(s2);
	}
}