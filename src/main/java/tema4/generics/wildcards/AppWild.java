package tema4.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class AppWild {

    public static void main(String[] args) {
        AppWild aw = new AppWild();

        Persona al1 = new Alumno("CARLOS");
        Persona al2 = new Profesor("TORRES");
        Persona al3 = new Alumno("CHARLY");

        List<Persona> list = new ArrayList<>();
        list.add(al1);
        list.add(al2);
        list.add(al3);

        aw.listarUpperBounded(list);
        System.out.println();
        aw.listarLowerBounded(list);
        System.out.println();
        aw.listarUnBounded(list);
    }

    //Recibe cualquier tipo que sea una subclase de Persona
    private void listarUpperBounded(List<? extends Persona> list){
        for (Persona a : list){
            System.out.println(a.getNombre());
        }
    }

    //Recibe cualquier tipo que sea una superclase
    private void listarLowerBounded(List<? super Alumno> list){
        for (Object al : list){
            System.out.println(((Persona)al).getNombre());
        }
    }

    //No se indica el tipo equivalente a Object
    private void listarUnBounded(List<?> list){
        for (Object al : list){
            System.out.println(((Persona)al).getNombre());
        }
    }

}
