package tema8.treeset;

import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {

    public static void main(String[] args) {
        //Ordena la lista de forma ascendente elimina objetos duplicados
        Set<Persona> list = new TreeSet<>();
        list.add(new Persona(1,"Carlos",22));
        list.add(new Persona(2,"Josue",21));
        list.add(new Persona(3,"Fimbres",28));
        list.add(new Persona(4,"Fimbres",29));

        for (Persona elemento : list){
            System.out.println(elemento.getId() + "-" + elemento.getEdad() + "-" + elemento.getNombre());
        }
    }

}
