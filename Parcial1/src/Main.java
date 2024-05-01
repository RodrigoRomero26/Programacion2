import Classes.*;
public class Main {
    public static void main(String[] args) {
        Campus campus = new Campus(1, "Martes", "Mañana");

        Facility facility = new Facility("Inicial", "Ala 3", "INS1", "Tres");

        Test test = new Test(257, "Prueba de resistencia");
        Test test1 = new Test(246, "Prueba de velocidad");

        campus.addFacilities(facility);
        campus.addTests(test);
        campus.addTests(test1);

        facility.setCampus(campus);

        Nationalteam nationalteam = new Nationalteam("Negro", "Argentina");

        Athlete athlete1 = new Athlete(44658478, "Mercedes", 1.73, 18, 65, nationalteam, test);
        Athlete athlete2 = new Athlete(41568985, "Marcos", 1.83, 21, 85, nationalteam, test);
        Athlete athlete3 = new Athlete(42587986, "Juan", 1.68, 20, 90, nationalteam, test);
        Athlete athlete4 = new Athlete(24514658, "Clara", 1.90, 21, 75, nationalteam, test);

        test.addAthletes(athlete1);
        test.addAthletes(athlete2);
        test1.addAthletes(athlete1);
        test1.addAthletes(athlete2);
        test1.addAthletes(athlete3);
        test1.addAthletes(athlete4);

        nationalteam.addAthletes(athlete1);
        nationalteam.addAthletes(athlete2);
        nationalteam.addAthletes(athlete3);
        nationalteam.addAthletes(athlete4);

        System.out.println("El nombre del tercer atleta de la segunda prueba es: "+facility.getCampus().getTests().get(1).getAthletes().get(2).getName());
        System.out.println("El codigo de la segunda prueba es: "+facility.getCampus().getTests().get(1).getCode());

        for (Athlete a : nationalteam.getAthletes()){
            System.out.println("Altura del atleta "+a.getName()+": "+a.getHeight());
        }

        for (Athlete a : nationalteam.getAthletes()){
            if (a.thereisextraWeight(a.calculateBMI())){
                if (a.calculateBMI() > 30){
                    System.out.println(a.getName()+" tiene obesidad.");
                }else{
                    System.out.println(a.getName()+" tiene sobrepeso.");
                }
            }else {
                System.out.println(a.getName()+" no tiene sobrepeso ni obesidad");
            }
        }


    }
}