import java.util.regex.*;
class RegExpTesting 
{
	public static void main(String[] args) 
	{
		Pattern pat = Pattern.compile("[@$@%^&*]");
		Matcher mat = pat.matcher("Ashukash");
		if (mat.find())
			System.out.println("Found");
		else
			System.out.println("Not found");
	}
}