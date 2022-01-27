package homeworktocheck.hw010pro.taskadditional.deep;

public class DeepClonning {
    public static void main(String[] args) {
        Car car = new Car("Ferrari Spyder", 370, 870);
        Car cloneCar = new Car(car);
        System.out.println("Первичный объект: ");
        System.out.println(car);
        System.out.println("Клонированный объект: ");
        System.out.println(cloneCar);
    }
}