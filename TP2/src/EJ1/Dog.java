package EJ1;

public class Dog extends Animal {
    private String race;
    private boolean vaccinated;

    public Dog(String name, int age, String animalType, double price, String race, boolean vaccinated) {
        super(name, age, animalType, price);
        this.race = race;
        this.vaccinated = vaccinated;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
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
        data = getAnimalType()+" Raza: "+getRace() + " Nombre: "+getName()+" Edad: "+getAge()+" Precio: "+getPrice();
        if (isVaccinated()){
            data = data.concat( " Vacunado");
        }else {
            data = data.concat(" No vacunado");
        }
        return data;
    }
}
