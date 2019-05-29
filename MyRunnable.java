class MyRunnable implements Runnable  
{
	public void run()
	{
		System.out.println("From run");
	}
	public static void main(String[] args) 
	{
		MyRunnable mr = new MyRunnable();
		Thread th = new Thread(mr);
		th.run();
		System.out.println("From main");
	}
}
