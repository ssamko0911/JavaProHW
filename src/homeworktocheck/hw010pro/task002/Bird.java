package homeworktocheck.hw010pro.task002;

import java.io.Serializable;

public class Bird implements Serializable {
    private String name;
    private final int NUMBER_OF_WINGS = 2;
    private transient double weight;

    public Bird() {

    }

    public Bird(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNUMBER_OF_WINGS() {
        return NUMBER_OF_WINGS;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Объект класса Птица: наименование - " + name + ", количество крыльев - " + NUMBER_OF_WINGS
                + ", вес - " + weight + ".";
    }
}