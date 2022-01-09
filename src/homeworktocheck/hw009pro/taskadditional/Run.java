package homeworktocheck.hw009pro.taskadditional;

import java.io.*;

public class Run {
    public static void main(String[] args) throws ClassNotFoundException {
        File file = new File("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw009pro\\taskadditional\\file.txt");
        Animal animal = new Animal("Тигр", 400.0, 4);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(animal);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}