package reviews;
import reviews.data.*;

public class Management
{



    public void initialize()
    {
        User[] users = new User[10];
        Business[] negocios = new Business[6];
        Reviews[] comentarios = new Reviews[12];
        User user;

        for(int i = 0; i < users.length; i++)
        {
            if(i < users.length)
            {
                users[i] = new User("nombre1", "0000");
            }
        }

        negocios[0] = new Restaurant("restaurante1", "Alicante", "Italiana");
        negocios[1] = new Restaurant("restaurante2", "Albacete", "Mediterranea");
        negocios[2] = new Hairdresser("peluqueria1", "Alicante", true);
        negocios[3] = new Hairdresser("peluqueria2", "Alicante", false);
        negocios[4] = new Garage("garage1", "Alicante", 5);
        negocios[5] = new Garage("garage2", "Alicante", 1);

        negocios[0].comentarios[0]=new Reviews(users[1], "muy bueno", 4);
        negocios[1].comentarios[1]=new Reviews(users[2], "muy bueno", 4);
        negocios[2].comentarios[2]=new Reviews(users[3], "muy bueno", 4);
        negocios[3].comentarios[3]=new Reviews(users[4], "muy bueno", 5);
        negocios[4].comentarios[4]=new Reviews(users[5], "muy bueno", 5);
        negocios[5].comentarios[5]=new Reviews(users[6], "muy bueno", 4);
        negocios[6].comentarios[6]=new Reviews(users[7], "muy bueno", 5);
        negocios[7].comentarios[7]=new Reviews(users[8], "muy bueno", 4);
        negocios[8].comentarios[8]=new Reviews(users[9], "muy bueno", 5);
        negocios[9].comentarios[9]=new Reviews(users[10], "muy bueno", 3);
        negocios[10].comentarios[10]=new Reviews(users[11], "muy bueno", 5);
        negocios[11].comentarios[11]=new Reviews(users[12], "muy bueno", 5);





    }
}
