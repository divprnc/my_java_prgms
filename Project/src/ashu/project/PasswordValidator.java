package ashu.project;

import java.util.Scanner;
import java.util.regex.*;
public class PasswordValidator 
{
    static boolean uppercase(String s)
    {
        Pattern pat = Pattern.compile("[A-Z]");
        Matcher mat = pat.matcher(s);
        if(mat.find())
            return true;
        System.out.println("Password must have atleast 1 uppercase character");
        return false;
    }
    static boolean lowercase(String s)
    {
        Pattern pat = Pattern.compile("[a-z]");
        Matcher mat = pat.matcher(s);
        if(mat.find())
            return true;
        System.out.println("Password must have atleast 1 lowercase characters");
        return false;
    }
    static boolean specialchars(String s)
    {
        Pattern pat = Pattern.compile("[@#$%&]");
        Matcher mat = pat.matcher(s);
        if(mat.find())
            return true;
        System.out.println("Password must contains 1 special characters");
        return false;
    }
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter password");
        String password = scn.nextLine();
        if(password.length() >= 8)
        {
            if(uppercase(password))
                if(lowercase(password))
                    if(specialchars(password))
                        System.out.println("Password is valid");
        }
        else
            System.out.println("Password must be 8 charcters long");
    }
}