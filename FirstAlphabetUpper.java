import java.util.Scanner;
class FirstAlphabetUpper 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String:");
		String s = scn.nextLine();
		String[] sarray = s.split(" ");
		int length = sarray.length;
		for (int i = 0; i < length; i++)
		{
			char ch = sarray[i].charAt(0);
			String s1 = String.valueOf(ch);
			String s2 = s1.toUpperCase();
			String s3 = sarray[i].replaceFirst(s1, s2);
			System.out.print(s3 + " ");
		}
		System.out.println();
	}
}