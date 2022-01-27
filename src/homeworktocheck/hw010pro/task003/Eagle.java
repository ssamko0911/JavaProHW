package homeworktocheck.hw010pro.task003;

import java.io.Serializable;

public class Eagle extends Animal implements Serializable {
    private int wingsSize;

    public Eagle() {

    }

    public Eagle(String name, int age, double weight, int wingsSize) {
        super(name, age, weight);
        this.wingsSize = wingsSize;
    }

    public int getWingsSize() {
        return wingsSize;
    }

    public void setWingsSize(int wingsSize) {
        this.wingsSize = wingsSize;
    }

    @Override
    public String toString() {
        return "Экземпляр класса Орёл: имя - " + super.getName() + ", возраст - " + super.getAge() + ", вес - " + super.getWeight()
                + ", размах крыльев - " + wingsSize + ".";
    }
}