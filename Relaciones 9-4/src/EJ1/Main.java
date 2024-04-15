package EJ1;

public class Main {
    public static void main(String[] args) {
    University university1 = new University("UTN");
    University university2 = new University("UnCuyo");
    Student student1 = new Student("Marcos", university1);
    Student student2 = new Student("Clara", university2);
    System.out.println(student1.getName()+" estudia en "+student1.getUniversity().getName());
    System.out.println(student2.getName()+" estudia en "+student2.getUniversity().getName());
    student2.change_uni(university1);
    System.out.println(student2.getName()+" estudia en "+student2.getUniversity().getName());
    }
}
