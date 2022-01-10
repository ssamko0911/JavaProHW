package homeworktocheck.hw010pro.taskadditional.deep;

public class Car {
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

    public Car (Car instanceToCopy){
        this(instanceToCopy.model, instanceToCopy.speed, instanceToCopy.weight);
    }

    @Override
    public String toString() {
        return "Экземпляр класса Car: модель - " + model + ", скорость - " + speed + ", масса - " + weight + ".";
    }
}