package homeworktocheck.hw009pro.task002;

import homeworktocheck.hw009pro.taskadditional.Animal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Run {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw009pro\\taskadditional\\file.txt"))){
            Animal animal = (Animal) objectInputStream.readObject();
            System.out.println(animal);
        } catch (ClassNotFoundException | IOException exception){
            exception.printStackTrace();
        }
    }
}