package tema11.stack;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) throws InterruptedException {
        //necesita interfaz comparable
        Queue<Persona> cola = new PriorityQueue<>();
        cola.offer(new Persona(1,"Carlos",21));
        cola.offer(new Persona(1,"Carlos",22));
        cola.offer(new Persona(1,"Carlos",23));
        cola.offer(new Persona(1,"Carlos",24));


        System.out.println("Primero");
        System.out.println(cola.peek());

        while (!cola.isEmpty()){
            System.out.println("Atendiendo a " + cola.poll());
            Thread.sleep(1000);
        }
    }

}
