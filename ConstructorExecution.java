class Parent
{
	Parent()
	{
		System.out.println("Non Parameterized Constructor of parent class");
	}
	Parent(int x)
	{
		System.out.println("Parameterized constructor of the parent class");
	}
}
class ConstructorExecution extends Parent
{
	ConstructorExecution()
	{
		System.out.println("Non Parameterized Constructor of child class");
	}
	ConstructorExecution(int x)
	{
		super(10);
		System.out.println("Parmeterized Constructor of the child class");
	}
	public static void main(String[] args) 
	{
		ConstructorExecution ce1 = new ConstructorExecution();
		ConstructorExecution ce2 = new ConstructorExecution(10);
	}
}