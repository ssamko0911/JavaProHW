package homework.tocheck.hw001pro.additionaltask;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Car o) {
        int tempOne = this.speed - o.speed;
        if (tempOne == 0) {
            int tempTwo = this.price - o.price;
            if (tempTwo == 0) {
                int tempThree = this.model.compareTo(o.model);
                if (tempThree == 0) {
                    return this.color.compareTo(o.color);
                } else {
                    return tempThree;
                }
            }
            return tempTwo;
        }
        return tempOne;
    }
}