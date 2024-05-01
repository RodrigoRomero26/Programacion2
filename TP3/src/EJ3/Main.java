package EJ3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Lunes");
        daysOfWeek.add("Martes");
        daysOfWeek.add("Miercoles");
        daysOfWeek.add("Jueves");
        daysOfWeek.add("Viernes");
        daysOfWeek.add("Sabado");
        daysOfWeek.add("Domingo");

        System.out.println("Insertando 'Juernes' a la posicion 4");
        daysOfWeek.add(4, "Juernes");

        System.out.println("Posicion 3: " + daysOfWeek.get(3));
        System.out.println("Posicion 4: " + daysOfWeek.get(4));

        System.out.println("Primer elemento: " + daysOfWeek.get(0));
        System.out.println("Ultimo elemento: " + daysOfWeek.get(daysOfWeek.size() - 1));

        System.out.println("Removiendo 'Juernes' de la lista");
        boolean removed = daysOfWeek.remove("Juernes");
        if (removed) {
            System.out.println("Juernes fue removido.");
        } else {
            System.out.println("Juernes no fue encontrado.");
        }

        Iterator<String> iterator = daysOfWeek.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Buscando Lunes en la lista");
        boolean containsMonday = daysOfWeek.contains("Lunes");
        if (containsMonday) {
            System.out.println("Lunes fue encontrado.");
        } else {
            System.out.println("Lunes no fue encontrado.");
        }

        System.out.println("Limpiando la lista");
        daysOfWeek.clear();
        System.out.println("La lista fue vaciada.");
    }
}
