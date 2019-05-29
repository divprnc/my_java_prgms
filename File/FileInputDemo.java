import java.io.*;
class FileInputDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("f.txt");
			String s = "Master in Computer Applications";
			byte[] b = s.getBytes();
			fos.write(b);
			fos.close();
			FileInputStream fin = new FileInputStream("f.txt");
			int i;
			while ( ( i = fin.read() ) != -1 )
			{
				System.out.print((char)i);
			}
			System.out.println();
		}
		catch (IOException e)
		{}
	}
}