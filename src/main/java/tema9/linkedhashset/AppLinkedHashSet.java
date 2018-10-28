package tema9.linkedhashset;

import tema8.treeset.Persona;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppLinkedHashSet {

    public static void main(String[] args) {
        //Valores unicos, ordena segun se vayan agregando objetos a la lista
        Set<tema8.treeset.Persona> list = new LinkedHashSet<>();
        list.add(new tema8.treeset.Persona(1,"Carlos",22));
        list.add(new tema8.treeset.Persona(2,"Josue",21));
        list.add(new tema8.treeset.Persona(3,"Fimbres",28));
        list.add(new tema8.treeset.Persona(4,"Fimbres",29));

        for (Persona elemento : list){
            System.out.println(elemento.getId() + "-" + elemento.getEdad() + "-" + elemento.getNombre());
        }
    }

}
