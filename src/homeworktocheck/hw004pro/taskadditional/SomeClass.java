package homeworktocheck.hw004pro.taskadditional;

/*
Создайте в package текстовый файл и клас, внесите в файл некий текст.
Выведите на экран содержимое файла.
*/

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SomeClass {
    public static void main(String[] args) {
        File someFile = new File("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw004pro\\taskadditional\\SomeTextFile.txt");
        try (FileWriter fileWriter = new FileWriter(someFile)) {
            String currentDate = "Today is SUN, 12.12.21";
            fileWriter.write(currentDate);
            fileWriter.flush();
            System.out.println("Данные записаны в файл.");
        } catch (IOException e) {
            System.err.println("Что-то пошло не так. Простите.");
        }

        try (FileReader fileReader = new FileReader(someFile)) {
            System.out.println("Данные считаны из файла и выведены в консоль: ");
            int count;
            while ((count = fileReader.read()) != -1) {
                System.out.print((char) count);
            }
        } catch (IOException e) {
            System.err.println("Что-то пошло не так. Простите.");
        }
    }
}
