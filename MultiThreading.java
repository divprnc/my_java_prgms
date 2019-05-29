class Table
{
	synchronized void printTable(int n)
	{
		try
		{
			for (int i = 1; i <= 5; i++)
			{
				System.out.println(n*i);
				Thread.sleep(1000);
			}
		}			
		catch (Exception e)
		{}
	}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
class MultiThreading
{
	public static void main(String[] args) 
	{
		Table t = new Table();
		MyThread1 mt1 = new MyThread1(t);
		MyThread2 mt2 = new MyThread2(t);
		mt1.start();
		mt2.start();
	}
} 