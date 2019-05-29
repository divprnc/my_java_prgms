class MyRunnable1 implements Runnable 
{
	public void run()
	{
		for ( int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		MyRunnable1 mr = new MyRunnable1();
		Thread th = new Thread(mr);
		th.run();
		for ( int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
	}
}