package homeworktocheck.hw010pro.taskadditional.shallow;

public class Car implements Cloneable {
    private String model;
    private int speed;
    private double weight;

    public Car() {

    }

    public Car(String model, int speed, double weight) {
        this.model = model;
        this.speed = speed;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Экземпляр класса Car: модель - " + model + ", скорость - " + speed + ", масса - " + weight + ".";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}