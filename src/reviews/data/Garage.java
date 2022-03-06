package reviews.data;

public class Garage extends Business
{
    private float price;

    public Garage(String name, String location, float price)
    {
        super(name, location);
        this.price = price;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float p)
    {
        price = p;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return Business.toString() + "Garage{" +
                "price=" + price +
                '}';
    }
}
}
