package EJ1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int aux;
        String sub;
        Scanner sc = new Scanner(System.in);
        Teacher teacher1 = new Teacher(40145878, "Valentin Curiel", "Matematicas");
        Teacher teacher2 = new Teacher(38784587, "Marcos Chavez", "Lengua");
        Student student1 = new Student(44311587, "Pablo Saez");
        Student student2 = new Student(42458745, "Franco Martinez");
        Student student3 = new Student(23568947, "Roberto Lorez");
        Subject subject1 = new Subject(1, "Mañana", "Matematicas", teacher1);
        Subject subject2 = new Subject(2, "Tarde", "Lengua", teacher2);
        Subject subject3 = new Subject(3, "Mañana", "Historia", teacher1);
        Group group1 = new Group("TUP1", 'A', subject1);
        Group group2 = new Group("TUP2", 'B', subject2);
        group1.addStudents(student1);
        student1.addBelongstoGroup(group1);
        group1.addStudents(student2);
        student2.addBelongstoGroup(group1);
        group2.addStudents(student3);
        student3.addBelongstoGroup(group2);
        group2.addStudents(student1);
        student1.addBelongstoGroup(group2);
        group1.addStudents(student2);
        student2.addBelongstoGroup(group1);
        subject1.setGroup(group1);
        subject2.setGroup(group2);
        subject3.setGroup(group1);
        teacher1.addImparts(subject1);
        teacher1.addImparts(subject3);
        teacher2.addImparts(subject2);

        //Ejercicio a
        aux = 0;
        for (Subject s : teacher1.getImparts()) {
            if (aux == 1) {
                System.out.println("La segunda materia de: " + teacher1.getName() + " es: " + s.getName());
            }
            aux++;
        }

        //Ejercicio b
        System.out.println(teacher1.getName() + " es profesor de: ");
        for (Subject s : teacher1.getImparts()) {
            System.out.println(s.getName());
        }

        //Ejercicio c
        System.out.println("Alumnos de " + subject1.getName() + ":");
        for (Student s : group1.getStudents()) {
            System.out.println(s.getName());
        }


        //Ejercicio d
        aux = 0;
        System.out.println("La letra del grupo 2 del alumno:" + student1.getName() + " es:");
        for (Group g : student1.getBelongstoGroup()) {
            if (aux == 1) {
                System.out.println(g.getLetter());
            }
            aux++;
        }

        //Ejercicio e
        for (Group g : student1.getBelongstoGroup()) {
            System.out.println("El grupo 1 del estudiante " + student1.getName() + " tiene la materia: " + g.getSubject().getName());
            break;
        }

        //Ejercicio f
        boolean found = false;
        System.out.println("Ingrese una materia para obtener que profesor la imparte. Matematicas/Lengua/Historia");
        while (true) {
            sub = sc.nextLine();
            if (sub.matches("(?i)(matematicas|lengua|historia)")) {
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese una materia.");
            }
        }
        for (Group g : student1.getBelongstoGroup()){
            if (g.getSubject().getName().equalsIgnoreCase(sub)){
                System.out.println("El profesor de "+sub+" es: "+g.getSubject().getTeacher().getName());
                found = true;
            }
        }
        if (!found){
            System.out.println("No se encontro al profesor de "+sub+" para el alumno especificado");
        }

        //Ejercicio G
        for (int i = 0; i < teacher1.getImparts().size(); i++){
            if (i == 1){
                System.out.println("Materia: "+teacher1.getImparts().get(i).getName());
                System.out.println("Alumnos:");
                for (int j= 0; j < teacher1.getImparts().get(i).getGroup().getStudents().size(); j++){
                    System.out.println(teacher1.getImparts().get(i).getGroup().getStudents().get(j).getName());
                }
            }

        }
        /*
        la asociación es una conexión general entre clases, mientras que la composición
        y la agregación son formas específicas de relaciones todo parte
        con diferentes niveles de dependencia y duración de vida entre los objetos involucrados.
        */
    }
}

