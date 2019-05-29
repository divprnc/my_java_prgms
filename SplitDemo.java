class SplitDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Master in Computer Applications";
		String[] arr = s1.split(" " , 2);
		for (int i =0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}