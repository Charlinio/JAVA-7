package tema3.singleton;

public class App {

    public static void main(String[] args) {
        /*
        PaisDAOImpl dao = new PaisDAOImpl();
        for (Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }

        System.out.println("===================================");

        for (Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }

        PaisDAOImpl daoi = new PaisDAOImpl();

        System.out.println("===================================");

        for (Object obj : daoi.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        */

        //Con Singleton correcto
        PaisDAOImpl dao = PaisDAOImpl.getInstance();
        for (Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }

        for (Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }

        PaisDAOImpl daoi = PaisDAOImpl.getInstance();
        for (Object obj : daoi.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
    }

}
