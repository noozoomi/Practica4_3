package reviews.data;

public class Hairdresser extends Business
{

    private boolean unisex = true;

    public Hairdresser(String name, String location, boolean unisex)
    {
        super(name, location);
        this.unisex = unisex;
    }

    public boolean getUnisex()
    {
        return unisex;
    }

    public void setUnisex(boolean u)
    {
        unisex = u;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return Business.toString() + "Hairdresser{" +
                "unisex=" + unisex +
                '}';
    }
}
