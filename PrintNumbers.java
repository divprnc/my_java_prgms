class PrintNumbers 
{
	void print1to50()
	{
		for ( int i = 1; i <= 50; i++)
		{
			System.out.print(i +"\t");
			try
			{
				Thread.sleep(100);				
			}
			catch (InterruptedException e)
			{}
		}
	}
	void print50to1()
	{
		for ( int i = 50; i >= 1; i--)
		{
			System.out.print(i +"\t");
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{}
		}
	}
}
