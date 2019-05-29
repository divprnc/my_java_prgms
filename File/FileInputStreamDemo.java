import java.io.*;
class FileInputStreamDemo 
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("File Input Demo.txt");
			PrintWriter input = new PrintWriter(file);
			input.print("Ashu Akash Singh");
			input.close(); 
			FileInputStream fin = new FileInputStream("File Input Demo.txt");
			int i;
			while( ( i = fin.read() )!= -1)
			{
				System.out.print((char)i);
			}
			System.out.println();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}