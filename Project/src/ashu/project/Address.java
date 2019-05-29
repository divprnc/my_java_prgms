package ashu.project;
public class Address implements Cloneable
{
    int flatNo = 1;
    String colony = "Ammerpet";
    String city = "Hyderabad";
    @Override
    public Address clone() throws CloneNotSupportedException
    {
        return (Address)super.clone();
    }
}