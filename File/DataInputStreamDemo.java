import java.io.*;
class DataInputStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis = new FileInputStream("Data.txt");
			DataInputStream dis = new DataInputStream(fis);
			int a = dis.readInt();
			float f = dis.readFloat();
			char ch = dis.readChar();
			boolean b = dis.readBoolean();
			String s = dis.readUTF();
			System.out.println(a);
			System.out.println(f);
			System.out.println(ch);
			System.out.println(b);
			System.out.println(s);
		}
		catch (Exception e)
		{}
	}
}
