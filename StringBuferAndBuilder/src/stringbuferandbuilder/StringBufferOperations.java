class StringBufferOperations 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1.append("d");
		System.out.println("sb1: " + sb1);
		System.out.println("sb2: " + sb2);
		System.out.println("sb1 == sb2: " + (sb1 == sb2));
		System.out.println();

		StringBuffer sb3 = new StringBuffer("21012014");
		System.out.println("sb3 : " + sb3);
		sb3.insert(2, '/');
		System.out.println("sb3: " + sb3);
		sb3.insert(5,'/');
		System.out.println("sb3: " + sb3);
		System.out.println();

		StringBuffer sb4 = new StringBuffer("Ashu xyz Akash");
		System.out.println("sb4: " + sb4);
		sb4.deleteCharAt(sb4.indexOf("xyz"));
		System.out.println("sb4: " + sb4);
		sb4.delete(sb4.indexOf("yz") , sb4.indexOf("yz") + 3);
		System.out.println("sb4: " + sb4);
		System.out.println();

		StringBuffer sb5 = new StringBuffer("Ashu Akash Singh");
		System.out.println("sb5: " + sb5);
		sb5.reverse();
		System.out.println("sb5: " + sb5);
		System.out.println();

		StringBuffer sb6 = new StringBuffer("Ashu kash");
		System.out.println("sb6: " + sb6);
		sb6.setCharAt(4 , 'A');
		System.out.println("sb6: " + sb6);
		sb6.insert(4 , " ");
		System.out.println("sb6: " + sb6);
		System.out.println();

		StringBuffer sb7 = new StringBuffer();
		System.out.println("sb7 capacity: " + sb7.capacity());
		System.out.println("sb7 length: " + sb7.length());
		sb7.insert(0 , "Ashu Akash Singh  ");
		System.out.println("sb7: " + sb7);
		System.out.println("sb7 capacity: " + sb7.capacity());
		System.out.println("sb7 length: " + sb7.length());
	}
}