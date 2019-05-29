import java.util.Scanner;
import java.io.File;
class ScannerDemo 
{
	public static void main(String[] args) throws Exception 
	{
		File file = new File("scores.txt");
		Scanner scn = new Scanner(file);
		while (scn.hasNext())
		{
			System.out.println(scn.hasNext());
			String a = scn.next();
			String line = scn.next();
			System.out.println(a);
		}
		System.out.println(scn.hasNext());
		scn.close();
	}
}