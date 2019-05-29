import java.io.*;
class DataOutputStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("Data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(97);
			dos.writeFloat(45.5F);
			dos.writeChar('a');
			dos.writeBoolean(true);
			dos.writeUTF("Ashu");
			
			fos.close();
		}
		catch (Exception e)
		{}
	}
}