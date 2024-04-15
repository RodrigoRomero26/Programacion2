package EJ3;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Valenchu INC");
        Company company2 = new Company("Rami INC");
        Department department1 = new Department("Marketing");
        Department department2 = new Department("Sales");
        Employee employee1 = new Employee("Operator", "Valentin");
        Employee employee2 = new Employee("Seller", "Marcos");
        Employee employee3 = new Employee("Administrative", "Clara");
        Employee employee4 = new Employee("Director", "Ramiro");
        company1.setDepartments(department1);
        company2.setDepartments(department2);
        department1.setEmployees(employee1);
        department2.setEmployees(employee2);
        department1.setEmployees(employee3);
        department2.setEmployees(employee4);
        for (Department department : company1.getDepartments()){
            for (Employee employee : department.getEmployees()){
                System.out.println("Compañia: "+company1.getName() +" Departamento: "+department.getName()+ " Empleados: "+employee.getName() );
            }
        }
        for (Department department : company2.getDepartments()){
            for (Employee employee : department.getEmployees()){
                System.out.println("Compañia: "+company2.getName() +" Departamento: "+department.getName()+ " Empleados: "+employee.getName() );
            }
        }
    }
}
