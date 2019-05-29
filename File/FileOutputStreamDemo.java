import java.io.*;
class FileOutputStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("File Output Demo.txt");
			fout.write('a');
			fout.write('b');
			fout.close();
			FileInputStream fin = new FileInputStream("File Output Demo.txt");
			int i;
			while ( ( i = fin.read() )!= -1 )
			{
				System.out.print((char)i);
			}
			System.out.println();
			fin.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}