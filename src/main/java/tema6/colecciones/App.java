package tema6.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Persona> list = new ArrayList<>();
        list.add(new Persona(1,"Carlos",22));
        list.add(new Persona(2,"Josue",21));
        list.add(new Persona(3,"Fimbres",28));

        //Collections.sort(list, new NombreComparator());
        /*
        Collections.sort(list, new Comparator<Persona>() {
            @Override
            public int compare(Persona per1, Persona per2) {
                return Integer.compare(per1.getEdad(), per2.getEdad());
            }
        });
        */
        //Collections.reverse(list);
        Collections.sort(list);

        for (Persona p : list){
            System.out.println(p.getEdad() + "*" + p.getNombre());
        }
    }

}
