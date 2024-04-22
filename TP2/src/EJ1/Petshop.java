package EJ1;

import java.util.ArrayList;
import java.util.List;

public class Petshop {
    private String name;
    private List<Animal> pets;

    public Petshop(String name) {
        this.name = name;
        this.pets = new ArrayList<Animal>();
    }

    public void addPet(Animal animal) {
        pets.add(animal);
        System.out.println("Animal agregado!");
    }

    public void sellPet(String name) {
        for (int i = 0; i < pets.size(); i++) {
            Animal animal = pets.get(i);
            if (name.equalsIgnoreCase(animal.getName())) {
                pets.remove(i);
                System.out.println("El animal "+animal.getName()+ " fue vendido por: $"+animal.getPrice());
                break;
            }
        }
    }

    public void feedAnimal(String name){
        for (Animal animal : pets){
            if (name.equalsIgnoreCase(animal.getName())){
                System.out.println(animal.getName()+" Fue alimentado!");
                break;
            }
        }
    }

    public void animalsList(){
        for (Animal animal : pets){
            System.out.println(animal.toString());
        }
    }

}
