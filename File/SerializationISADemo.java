import java.io.*;
class A implements Serializable
{
	int x;
	A()
	{
		x = 10;
	}
}
class B extends A 
{
	int y;
	B()
	{
		y = 20;
	}
	public String toString()
	{
		return "x: " + x + "\n" +
					"y: " + y;
	}
}
class SerializationISADemo 
{
	public static void main(String[] args) throws Exception
	{
		B objB = new B();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ISADemo.ser"));
		objB.x = 30;
		objB.y = 40;
		oos.writeObject(objB);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ISADemo.ser"));
		System.out.println(ois.readObject());
	}
}