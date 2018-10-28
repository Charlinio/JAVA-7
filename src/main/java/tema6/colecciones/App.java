package tema6.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Persona> list = new ArrayList<>();
        list.add(new Persona(1,"Carlos",22));
        list.add(new Persona(2,"Josue",21));
        list.add(new Persona(3,"Fimbres",28));

        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);
    }

}
