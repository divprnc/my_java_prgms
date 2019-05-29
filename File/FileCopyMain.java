import java.io.*;
import java.util.Scanner;
public class FileCopyMain 
{
    public static void main(String[] args) 
    {
        try
        {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter source file name: ");
			String src = scn.nextLine();
			System.out.print("Enter target file name: ");
			String dest = scn.nextLine();
            FileCopy.copyFile(src, dest);
        }
        catch(FileNotFoundException fnfe)
        {
			System.out.println("Error: Given files are not found");
        }
        catch(IOException ioe)
        {
            System.out.println("Error: Reading or Writing Failed");
			ioe.printStackTrace();
        }
    }
}
