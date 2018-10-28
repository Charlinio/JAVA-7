package tema7.hashset;

import java.util.HashSet;
import java.util.Set;

public class AppSet {

    public static void main(String[] args) {
        //Elimina valores duplicados y orden aleatorio
        Set<Persona> list = new HashSet<>();
        list.add(new Persona(1,"Carlos",22));
        list.add(new Persona(2,"Josue",21));
        list.add(new Persona(3,"Fimbres",28));
        list.add(new Persona(4,"Fimbres",28));

        for (Persona elemento : list){
            System.out.println(elemento.getNombre());
        }
    }

}
