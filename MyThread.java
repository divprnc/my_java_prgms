class MyThread extends Thread 
{
	public void run()
	{
		for ( int i =1; i < 50; i++)
		{
			System.out.println("run: "+i);
		}
	}
	public static void main(String[] args) 
	{
		MyThread my = new MyThread();
		Thread th = new Thread(my);
		my.start();
		for ( int i =1; i < 50; i++)
		{
			System.out.println("main: "+i);
		}
	}
}