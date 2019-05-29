package ashu.project;
public class BikeFactory
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Bike b1 = new Bike(1001,2001,"PULSAR");
        Bike b2 = (Bike)b1.clone();
        System.out.println(b1 == b2);
        b1.setBikeNumber(7965);
        b2.setBikeNumber(6574);
        System.out.println("b1......");
        System.out.println(b1);
        System.out.println("b2......");
        System.out.println(b2);
    }
}
