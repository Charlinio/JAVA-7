package tema11.stack;

import java.util.Stack;

public class AppStack {

    public static void main(String[] args) throws InterruptedException {
        Stack<Persona> pila = new Stack<>();
        pila.push(new Persona(1,"Carlos",22));
        pila.push(new Persona(2,"Carlos",23));
        pila.push(new Persona(3,"Carlos",24));
        pila.push(new Persona(4,"Carlos",25));

        for (Persona elemento : pila){
            System.out.println(elemento);
        }

        System.out.println("\nTope");
        System.out.println(pila.peek());

        System.out.println("\nBuscar");
        System.out.println(pila.search(new Persona(1,"Carlos",22)));

        System.out.println("\nLIFO");
        while (!pila.isEmpty()){
            System.out.println("Atendiendo a " + pila.pop());
            Thread.sleep(1000);
        }

    }



}
