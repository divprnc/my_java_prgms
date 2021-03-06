public class StringBuferConstructors 
{
    public static void main(String[] args) 
    {
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1 capacity: " + sb1.capacity());
        
        StringBuffer sb2 = new StringBuffer(4);
        System.out.println("sb2 capacity: " + sb2.capacity());

		// StringBuffer sb3 = new StringBuffer(-1);   RE: NegativeArraySizeException

		StringBuffer sb3 = new StringBuffer("abc");
		System.out.println("sb3 capacity: " + sb3.capacity());

		// StringBuffer sb4 = new StringBuffer(null); RE: NullPointerException
    }
}
