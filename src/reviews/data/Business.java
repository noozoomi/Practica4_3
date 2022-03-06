package reviews.data;

public abstract class Business {

    protected String name, location;
    protected Reviews[] reviews = new Reviews[10];


    public Business(String name, String location)
    {
        this.name = name;
        this.location = location;
        this.reviews = reviews;
    }

    public String GetName()
    {
        return name;
    }

    public void SetName(String n)
    {
        name = n;
    }

    public String GetLocation()
    {
        return location;
    }

    public void SetLocation(String l)
    {
        location = l;
    }

    @Override
    public java.lang.String toString() {
        return "Business{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';

    }
}
