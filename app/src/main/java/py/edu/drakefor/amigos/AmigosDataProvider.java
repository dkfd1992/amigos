package py.edu.drakefor.amigos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LUIS on 05/10/2016.
 */
public class AmigosDataProvider {
    public static List<Amigo> getAmigos(){
    List<Amigo> amigos = new ArrayList<Amigo>();

       for (int i=1; i<101;i++) {
           Amigo a = new Amigo();
           a.setNombre("Nombre" + i);
           a.setEmail("Email" + i + "@Usuario.com");
           amigos.add(a);

       }
        return amigos;

    };

}
