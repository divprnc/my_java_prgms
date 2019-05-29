class ThreadDemo1 extends Thread 
{
	public synchronized void run()
	{
		for ( int i = 1; i <= 50; i++ )
		{
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) 
	{
		ThreadDemo1 td1 = new ThreadDemo1();
		td1.start();
		ThreadDemo1 td2 = new ThreadDemo1();
		td2.start();
		ThreadDemo1 td3 = new ThreadDemo1();
		td3.start();
	}
}
