package tema1.instancestatic;

public class Alumno extends Persona{

    //Un metodo de Instancia no puede ser sobreescrito por un metodo de clase ni viceversa
    /*
    public int sumar(int numero){
        return numero + 2;
    }
    */

    public static int sumar(int numero){
        return numero + 2;
    }

}
