import EJ1.*;

public class Main {
    public static void main(String[] args) {
        Petshop petshop1 = new Petshop("Teru Shop");
        Bird bird1 = new Bird("Teru", 2, "Pajaro",500, "Tero",true);
        Cat cat1 = new Cat("Pipo", 3, "Gato", 400, "Naranja",true );
        Dog dog1 = new Dog("Seba", 5, "Perro", 800, "Pastor Aleman",false );
        Fish fish1 = new Fish("Silvi", 1, "Pez", 300, "Pez bruja", true);
        petshop1.addPet(bird1);
        petshop1.addPet(cat1);
        petshop1.addPet(dog1);
        petshop1.addPet(fish1);
        petshop1.sellPet("Silvi");
        petshop1.feedAnimal("Teru");
        petshop1.animalsList();
    }
}