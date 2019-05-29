import java.io.*;
class TestFileClass 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("scores.txt");
		PrintWriter output = new PrintWriter(file);
		System.out.println(file.exists());
		output.printf("Ashu Akash Singh");
		output.println(90);
		output.close();
	}
}