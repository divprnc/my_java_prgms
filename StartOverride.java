class StartOverride extends Thread 
{
	public void run()
	{
		System.out.println("Run");
	}
	public void start()
	{
		System.out.println("Start");
		run();
		super.start();
	}
	public static void main(String[] args) 
	{
		 StartOverride so1 = new StartOverride();
		 so1.start();
		 System.out.println("Main");
	}
}
