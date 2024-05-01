package EJ4;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nuevo alumno");
            System.out.println("2. Mostrar lista de alumnos");
            System.out.println("3. Calcular y mostrar la media de notas de todos los alumnos");
            System.out.println("4. Mostrar el alumno con la nota más alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("6. Salir");
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
                    System.out.print("Ingrese el nombre del alumno: ");
                    String name = scanner.nextLine();
                    if (!name.matches("[a-zA-Z]+")) {
                        System.out.println("Error: El nombre solo puede contener letras.");
                        continue;
                    }
                    System.out.print("Ingrese la edad del alumno: ");
                    int age;
                    try {
                        age = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Por favor, ingrese una edad válida.");
                        continue;
                    }
                    System.out.print("Ingrese la nota del alumno: ");
                    double grade;
                    try {
                        grade = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Por favor, ingrese una nota válida.");
                        continue;
                    }
                    studentsList.add(new Student(name, age, grade));
                    break;
                case 2:
                    System.out.println("Lista de alumnos:");
                    for (Student student : studentsList) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    double sumGrades = 0;
                    for (Student student : studentsList) {
                        sumGrades += student.getGrade();
                    }
                    double averageGrade = sumGrades / studentsList.size();
                    System.out.println("La media de notas de todos los alumnos es: " + averageGrade);
                    break;
                case 4:
                    Student highestGradeStudent = studentsList.get(0);
                    for (Student student : studentsList) {
                        if (student.getGrade() > highestGradeStudent.getGrade()) {
                            highestGradeStudent = student;
                        }
                    }
                    System.out.println("El alumno con la nota más alta es: " + highestGradeStudent);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del alumno a buscar: ");
                    String nameToSearch = scanner.nextLine();
                    boolean found = false;
                    for (Student student : studentsList) {
                        if (student.getName().equalsIgnoreCase(nameToSearch)) {
                            System.out.println("Información del alumno encontrado:");
                            System.out.println(student);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No se encontró ningún alumno con ese nombre.");
                    }
                    break;
                case 6:
                    running = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
