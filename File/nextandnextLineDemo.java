import java.io.File;
import java.util.Scanner;
class nextandnextLineDemo 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner scn = new Scanner(new File("test.txt"));
			int value = scn.nextInt();
			//String line = scn.next();
			System.out.println(value);
		scn.close();
	}
}