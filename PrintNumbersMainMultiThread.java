class PrintNumbersMainMultiThread extends Thread
{
	static PrintNumbers pn = new PrintNumbers();
	public void run()
	{
		pn.print50to1();
	}
	public static void main(String[] args) 
	{
		PrintNumbersMainMultiThread pt1 = new PrintNumbersMainMultiThread();
		long time1 = System.currentTimeMillis();
		pt1.start();
		pn.print1to50();
		System.out.println();
		long time2 = System.currentTimeMillis();
		System.out.println("Time taken to complete both tasks:" + ((time2 - time1) / 1000) + "seconds");
	}
}