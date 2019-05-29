import java.io.*;
public class FileCopy 
{
    public static void copyFile(String src, String dest) throws FileNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        int i;
        while ( ( i = fis.read())!= -1)
        {
            fos.write(i);
        }
    }
}
