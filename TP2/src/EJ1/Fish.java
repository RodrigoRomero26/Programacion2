package EJ1;

public class Fish extends Animal{
    private String species;
    private boolean dance;

    public Fish(String name, int age, String animalType, double price, String species, boolean speaks) {
        super(name, age, animalType, price);
        this.species = species;
        this.dance = speaks;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isDance() {
        return dance;
    }

    public void setDance(boolean dance) {
        this.dance = dance;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getAnimalType() {
        return super.getAnimalType();
    }

    @Override
    public void setAnimalType(String animalType) {
        super.setAnimalType(animalType);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        String data;
        data = getAnimalType()+" Raza: "+ getSpecies() + " Nombre: "+getName()+" Edad: "+getAge()+" Precio: "+getPrice();
        if (isDance()){
            data = data.concat( " Puede bailar!");
        }else {
            data = data.concat(" No puede bailar.");
        }
        return data;
    }

}
