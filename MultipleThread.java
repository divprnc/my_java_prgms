class MultipleThread extends Thread 
{
	public void run()
	{
		for ( int i = 1; i <= 50; i++)
		{
			System.out.println(getName() + "Run:" + i);
		}
	}
	public static void main(String[] args) 
	{
		MultipleThread mt1 = new MultipleThread();
		mt1.start();
		MultipleThread mt2 = new MultipleThread();
		mt2.start();
		MultipleThread mt3 = new MultipleThread();
		mt3.start();
	}
}
