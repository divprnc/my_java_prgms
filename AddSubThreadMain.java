class AddSubThreadMain 
{
	public static void main(String[] args) 
	{
		AddThread at1 = new AddThread();
		at1.start();
		SubThread st1 = new SubThread();
		st1.start();
		System.out.println("Main Terminated");
	}
}
