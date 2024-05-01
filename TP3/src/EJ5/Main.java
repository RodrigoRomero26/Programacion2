package EJ5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();

        boolean running = true;
        while (running) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Eliminar una tarea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String description = scanner.nextLine();
                    System.out.print("Ingrese la prioridad de la tarea: ");
                    int priority;
                    try {
                        priority = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Por favor, ingrese una prioridad válida.");
                        continue;
                    }
                    taskList.addTask(new Task(description, priority));
                    break;
                case 2:
                    System.out.println("Todas las tareas:");
                    for (Task task : taskList) {
                        System.out.println(task);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la descripción de la tarea a eliminar: ");
                    String descToDelete = scanner.nextLine();
                    taskList.deleteTask(descToDelete);
                    break;
                case 4:
                    running = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}