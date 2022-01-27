package homeworktocheck.hw010pro.taskadditional.shallow;

import homeworktocheck.hw010pro.taskadditional.shallow.Car;

public class ShalllowClonning {
    public static void main(String[] args) {
        Car car = new Car("OPEL Astra", 270, 1100);
        try {
            Car cloneCar = (Car) car.clone();
            System.out.println("Первичный объект: ");
            System.out.println(car);
            System.out.println("Клонированный объект: ");
            System.out.println(cloneCar);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}