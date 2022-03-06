package reviews.data;

public class Restaurant extends Business
{
    private String typeFood;

    public Restaurant(String name, String location, String typeFood)
        {
            super(name,location);
            this.typeFood = typeFood;
        }

        public String GetTypeFood()
        {
            return typeFood;
        }

        public void SetTypeFood(String t)
        {
            typeFood = t;
        }

    @Override
    public java.lang.String toString() {
        return Business.toString() + "Restaurant{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }
}
