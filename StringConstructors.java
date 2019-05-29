class StringConstructors 
{
	public static void main(String[] args) 
	{
		String s1 = new String();
		System.out.println(s1); // no output
		String s2 = "abc";
		String s3 = new String(s2);
		String s4 = new String("bbc");
		String s5 = s4;
		System.out.println("s2: " + s2); // abc
		System.out.println("s3: " + s3); // abc
		System.out.println("s4: " + s4); // bbc
		char ch[] = { 'a' , 'b' , 'c' , 'd' , 'e' , 'f' };
		String s6 = new String(ch); 
		System.out.println("s6: " + s6); // abcdef
		String s7 = new String(ch , 2 , 3);
		System.out.println("s7: " + s7); // cde
		byte[] b = { 97 , 98 , 99 };
		String s8 = new String(b); 
		System.out.println(s8); // abc
		String s9 = new String(b , 1 , 1);
		System.out.println("s9: " + s9); // b
	}
}