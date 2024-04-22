package EJ1;

public class Cat extends Animal {
    private String race;
    private boolean sterilized;

    public Cat(String name, int age, String animalType, double price, String race, boolean sterilized) {
        super(name, age, animalType, price);
        this.race = race;
        this.sterilized = sterilized;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
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
        if (isSterilized()){
            data = data.concat( " Esterilizado");
        }else {
            data = data.concat(" No esterilizado");
        }
        return data;
    }

}
