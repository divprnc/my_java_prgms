class ValueOfDemo 
{
	public static void main(String[] args) 
	{
		Object obj = "Object";
		String s1 = String.valueOf(obj);
		System.out.println(s1);
		char[] ch = {'C'  , 'h' , 'a' , 'r' , ' ' , 'A' , 'r' , 'r' , 'a' , 'y'};
		String s2 = String.valueOf(ch);
		System.out.println(s2);
		boolean b = true;
		String s3 = String.valueOf(b);
		System.out.println(s3);
		char c = 'A';
		String s4 = String.valueOf(c);
		System.out.println(s4);
		int i = 10;
		String s5 = String.valueOf(i);
		System.out.println(s5);
		long l = 20L;
		String s6 = String.valueOf(l);
		System.out.println(s6);
		float f = 3.5f;
		String s7 = String.valueOf(f);
		System.out.println(s7);
		double d = 5.8;
		String s8 = String.valueOf(d);
		System.out.println(s8);
	}
}