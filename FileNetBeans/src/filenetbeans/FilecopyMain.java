import java.io.*;
class FilecopyMain 
{
    public static void main(String[] args) 
    {
        try
        {
            FileCopy.copyFile(args[0], args[1]);
        }
        catch (ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println("Please Enter source and target file name");
            System.out.println("Usage: java FileCopyMain abc.txt xyz.txt");
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Please Enter valid file name");
        }
        catch(IOException ioe)
        {
            System.out.println("Plaese Enter file names");
        }
    }
}
