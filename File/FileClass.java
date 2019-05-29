import java.io.File;
import java.io.PrintWriter;
class FileClass 
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("test.txt");
			PrintWriter pw = new PrintWriter(file);
			pw.print("34 567");
			pw.close();			
		}
		catch (Exception e)
		{}	
	}
}