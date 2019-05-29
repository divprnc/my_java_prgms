class ThreadDemo2 extends Thread 
{
	int x;
	ThreadDemo2()
	{
		x = 5;
	}
	ThreadDemo2(int x)
	{
		this.x = x;
	}
	public void run()
	{
		for ( int i = 1; i < x; i++)
		{
			System.out.println(getName() + "Run:" + i);
		}
	}
	public static void main(String[] args) 
	{
		ThreadDemo2 td1 = new ThreadDemo2();
		td1.start();
		ThreadDemo2 td2 = new ThreadDemo2( 10 );
		td2.start();
		ThreadDemo2 td3 = new ThreadDemo2( 20 );
		td3.start();
		for ( int i = 1; i <= 20; i++ )
		{
			System.out.println("Main:" + i);
		}
	}
}