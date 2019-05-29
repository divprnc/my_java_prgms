class StartRunExecution extends Thread
{
	public void run()
	{
		for ( int i = 1; i <= 50; i++)
		{
			System.out.println("run:"+i);
		}
	}
	public static void main(String[] args) 
	{
		StartRunExecution sre = new StartRunExecution();
		sre.start();
		sre.run();
		for ( int i = 1; i <= 50; i++)
		{
			System.out.println("main:"+i);
		}
	}
}
