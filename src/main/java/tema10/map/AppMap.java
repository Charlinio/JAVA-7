package tema10.map;

import java.util.*;
import java.util.Map.Entry;
public class AppMap {

    public static void main(String[] args) {
        Map<Persona, String> map = new HashMap<>();
        //Map<Integer, String> map = new TreeMap<>();
        //Map<Integer, String> map = new LinkedHashMap<>();
        map.put(new Persona(1,"Carlos",22),"Hola");
        map.put(new Persona(1,"Carlos",22),"Hola");
        map.put(new Persona(1,"Carlos",22),"Hola");
        map.put(new Persona(1,"Carlos",22),"Hola");
        map.put(new Persona(1,"Carlos",22),"Hola");
        map.put(new Persona(1,"Carlos",22),"Hola");

        /*
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
        */

        for (Entry<Persona, String> ent : map.entrySet()){
            System.out.println("Clave: " + ent.getKey() + " -> Valor: " + ent.getValue());
        }

    }

}
