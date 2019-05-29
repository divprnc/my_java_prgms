class StringOperation 
{
	public static void main(String[] args) 
	{
		
		String s = "Java programming Language";

		//finding string is empty or not
		System.out.println(s.isEmpty());

		//finding length of the string
		System.out.println(s.length());

		String s1 = "";
		String s2 = " ";
		String s3 = new String("");
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());

		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		//printing string object (toString())
		System.out.println(s);

		//comparing two strings
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = new String("Abc");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));

		//comparing method without case
		//public boolean equalsIgnoreCase(String s)
		String s4 = new String("a");
		String s5 = new String("A");
		System.out.println(s4.equals(s5));

		//comparing string without case
		//public boolean equalsIgnoreCase(String s)
		System.out.println(s4.equalsIgnoreCase(s5));

		//comparing string lexicographically, means after comparision method should return difference between string content
		//public int compareTo(String s)
		//public int compareToIgnoreCase(String s)
		String s6 = new String("a");
		String s7 = new String("A");
		System.out.println(s6.compareTo(s7));
		System.out.println(s6.compareToIgnoreCase(s7));

		String s8 = "abcdef";
		String s9 = "abc";
		System.out.println(s8.compareTo(s9));
		
		//startsWith() and endsWith()
		String s = "Java Programming Language";
		System.out.println(s.startsWith("Java"));
		System.out.println(s.startsWith("java"));

		System.out.println(s.endsWith("Language"));

		//charAt()
		//public char charAt(int index)
		String s1 = new String("Java programming Language");
		System.out.println("Character at 10th index is : " + s1.charAt(10));

		//indexOf() and lastIndexOf()
		//public int indexOf(char ch)
		//public int lastIndexOf(char ch)
		//public int indexOf(String s)
		//public int lastIndexOf(String s)
		//public int indexOf(char ch, int fromIndex)
		//public int lastIndexOf(char ch, int fromIndex)
		//public int indexOf(String s, int fromIndex)
		//public int lastIndexOf(String s, int fromIndex)
		String s1 = new String("Java Programming Language");
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.lastIndexOf('a'));

		System.out.println(s1.indexOf( "a" , 4 ));
		System.out.println(s1.indexOf( 'a' , 4 ));
		System.out.println(s1.lastIndexOf( "a" , 21 ));
		System.out.println(s1.lastIndexOf( 'a' , 22 ));

		System.out.println(s1.lastIndexOf( "k" , 22 ));
	}
}