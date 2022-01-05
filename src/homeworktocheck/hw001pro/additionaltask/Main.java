package homeworktocheck.hw001pro.additionaltask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(185, 10000, "Volvo", "Blue");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car c4 = new Car(185, 5000, "Volvo", "Green");
        Car c5 = new Car(190, 2000, "Opel", "Black");
        Car[] c = {c1, c2, c3, c4, c5};

        Arrays.sort(c);   // ClassCastException
        System.out.println("Результат сортировки: ");
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}