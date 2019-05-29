package ashu.project;
public class Bike implements Cloneable
{
    private int enegineNumber;
    private final int modelNumber;
    private final String type;
    private int bikeNumber;
    public Bike(int enegineNumber,int modelNumber,String type)
    {
        this.enegineNumber = enegineNumber;
        this.modelNumber = modelNumber;
        this.type = type;
    }
    public void setBikeNumber(int bikeNumber)
    {
        this.bikeNumber = bikeNumber;
    }
    @Override
    public Bike clone() throws CloneNotSupportedException
    {
        Bike newBike = (Bike)super.clone();
        newBike.enegineNumber = this.enegineNumber + 10;
        return newBike;
    }
    @Override
    public String toString()
    {
        return "Enegine Number: " + enegineNumber + "\n" +
               "Model Numbe: " + modelNumber + "\n" +
               "Type: " + type + "\n" + 
               "Bike Number: " + bikeNumber;
    }
}