class ThreadNameAndPriority extends Thread 
{
	ThreadNameAndPriority()
	{
		super();
	}
	ThreadNameAndPriority(String name)
	{
		super(name);
	}
	public void run()
	{
		for ( int i = 1; i <= 10; i++)
		{
			System.out.println(getName() + " i: " + i);
		}
	}
	public static void main(String[] args) 
	{
		ThreadNameAndPriority th1 = new ThreadNameAndPriority();
		ThreadNameAndPriority th2 = new ThreadNameAndPriority("child - 2");

		System.out.println("th1 name and priority");
		System.out.println(th1.getName() + " "+ th1.getPriority());

		System.out.println("th2 name and priority");
		System.out.println(th2.getName() + " " + th2.getPriority());

		th1.setName("child - 1");
		th1.setPriority(9);

		System.out.println("th1 name and priority");
		System.out.println(th1.getName() + " "+ th1.getPriority());

		th2.setPriority(6);

		System.out.println("th2 name and priority");
		System.out.println(th2.getName() + " "+ th2.getPriority());

		th1.start();
		th2.start();

		for ( int i = 1; i <= 10; i++)
		{
			System.out.println("Main: " + i);
		}
	}
}
