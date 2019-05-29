class AddThread extends Thread 
{
	public void run()
	{
		int sum = 0;
		for ( int i = 1; i <= 50; i++)
		{
			sum += i;
			System.out.println("Summation:" + sum);
		}
	}
}
