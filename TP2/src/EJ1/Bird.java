package EJ1;

public class Bird extends Animal {
    private String species;
    private boolean speaks;

    public Bird(String name, int age, String animalType, double price, String species, boolean speaks) {
        super(name, age, animalType, price);
        this.species = species;
        this.speaks = speaks;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isSpeaks() {
        return speaks;
    }

    public void setSpeaks(boolean speaks) {
        this.speaks = speaks;
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
        if (isSpeaks()){
            data = data.concat( " Puede hablar!");
        }else {
            data = data.concat(" No puede hablar.");
        }
        return data;
    }
}
