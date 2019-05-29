class SplitOperation 
{
	public static void main(String[] args) 
	{
		String s = "Java Programming Langauge";
		String[] sarray = s.split(" ");
		int size = sarray.length;
		for (int i = 0; i < size; i++)
		{
			System.out.println( i + " token is " + sarray[i] );
		}
	}
}
