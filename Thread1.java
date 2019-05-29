class PrintNumbers
{
	void print1to50()
	{
		for ( int i = 1; i <= 50; i++ )
		{
			System.out.print( i + "\t" );
			try
			{
			Thread.sleep(500);				
			}
			catch (InterruptedException e)
			{}
		}
		System.out.println();
	}
	void print50to1()
	{
		for ( int i = 50; i >= 1; i-- )
		{
			System.out.print( i + "\t" );
			try
			{
			Thread.sleep(500);				
			}
			catch (InterruptedException e)
			{}
		}
		System.out.println();
	}
}
class Thread1 extends Thread
{
	static PrintNumbers pn = new PrintNumbers();
	public void run()
	{
		pn.print1to50();
	}
	public static void main(String args[])
	{
		Thread1 th = new Thread1();
		long time1 = System.currentTimeMillis();
		th.start();
		pn.print50to1();
		long time2 = System.currentTimeMillis();
		System.out.println("Total time taken:" + ((time2 - time1) / 1000) + "seconds");
	}
}