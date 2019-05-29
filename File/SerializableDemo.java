import java.io.*;
class SerializableDemo implements Serializable 
{
	String name;
	int roll_no;
	SerializableDemo(String name, int roll_no)
	{
		this.name = name;
		this.roll_no = roll_no;
	}
	public String toString()
	{
		return "Name: " + name + "\n" +
					"Roll Number: " + roll_no + "\n";
	}
	public static void main(String[] args) throws Exception
	{
		SerializableDemo sd = new SerializableDemo("Ashu", 101);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SerializableDemo.ser"));
		oos.writeObject(sd);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SerializableDemo.ser"));
		// System.out.println(ois.readObject());
		SerializableDemo sd1 = (SerializableDemo)ois.readObject();
		System.out.println(sd1.name);
	}
}