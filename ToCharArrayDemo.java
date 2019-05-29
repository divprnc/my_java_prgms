class ToCharArrayDemo 
{
	public static void main(String[] args) 
	{
		String s1= "Master in Computer Applications";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++)
			System.out.print(ch[i]);
		System.out.println();
	}
}