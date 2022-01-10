package homeworktocheck.hw009pro.task003;

import java.io.*;

public class Car implements Externalizable {
    private static String model;
    private int age;
    private int speed;

    public Car() {

    }

    public Car(String model, int age, int speed) {
        Car.model = model;
        this.age = age;
        this.speed = speed;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(model);
        out.writeInt(age);
        out.writeInt(speed);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        model = (String) in.readObject();
        age = in.readInt();
        speed = in.readInt();
    }

    @Override
    public String toString() {
        return "Модель авто: " + model + ", срок эксплуатации: " + age + ", скорость: " + speed + ".";
    }
}

class Run {
    public static void main(String[] args) {
        Car car = new Car("Opel", 2, 260);
        File file = new File("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw009pro\\task003\\file1.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            objectOutputStream.writeObject(car);
            car = (Car) objectInputStream.readObject();
            System.out.println(car);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}