package Classes;
import java.util.Random;
import java.util.random.*;
public class Athlete extends Person implements Contract {
    private double height;
    private int age;
    private double weight;
    private Nationalteam belongs;
    private Test test;

    public Athlete(int dni, String name, double height, int age, double weight, Nationalteam team, Test test) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.belongs = team;
        this.test = test;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateBMI() {
        return (weight / (height*height));
    }

    @Override
    public boolean thereisextraWeight(double calculate) {
        if (calculate >= 25 && calculate <= 30) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int takePulse() {
        Random random = new Random();
        return random.nextInt(100,120);
    }
}
