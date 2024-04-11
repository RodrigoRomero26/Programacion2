import Ejercicio2.Guerrero;
import Ejercicio2.Mago;
import Ejercicio2.Picaro;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero(10, "Marcos", 500, true);
        Mago mago = new Mago(12, "Pipo", 350, 15);
        Picaro picaro = new Picaro(16, "Ane", 200, true);
        System.out.println("El guerrero es atacado por el mago! Recibe: "+guerrero.defend(mago.attack())+" de daño");
        System.out.println("El mago es atacado por el guerrero! Recibe: "+mago.defend(guerrero.attack())+" de daño");
        System.out.println("El picaro es atacado por el mago! Recibe: "+picaro.defend(mago.attack())+" de daño");
        System.out.println("El mago es atacado por el picaro! Recibe: "+mago.defend(picaro.attack())+" de daño");
    }
}