class SubThread extends Thread 
{
	public void run() 
	{
		int sub = 0;
		for ( int i = 50; i >= 1; i--)
		{
			i -= sub;
			System.out.println("Difference:" + i);
		}
	}
}
