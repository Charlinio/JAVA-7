package tema4.generics;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        /*
        Clase<String,Integer,String,Double> c = new Clase<>("MitoCode",25,"Jaime",25.0);
        c.mostrarTipo();
        */

        List<Clase<String,Integer,String,String>> list = new ArrayList<>();
        list.add(new Clase<>("Carlos",25,"Torres","Charly"));

        for (Clase<String,Integer,String,String> cl : list){
            cl.mostrarTipo();
        }
    }

}
