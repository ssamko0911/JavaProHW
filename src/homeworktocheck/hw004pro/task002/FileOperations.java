package homeworktocheck.hw004pro.task002;

/*
Задание 2
Создайте файл, запишите в него произвольные данные и закройте файл. Затем снова откройте этот файл,
прочитайте из него данные и выведете их на консоль
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw004pro\\task002\\AnotherFile.txt")) {
            // если файла нет, то он создастся. С кирилицей проблемы в ОС Windows;
            String taskTwo = "I've been trying to cope with new topic IO\\NIO, it`s not a rocket science, but not obvious.";
            fileOutputStream.write(taskTwo.getBytes(StandardCharsets.UTF_8));
            System.out.println("Данные записаны в файл.");
        } catch (IOException e) {
            System.err.println("Что-то пошло не так. Простите.");
        }
        System.out.println("Чтение из файла и вывод в консоль: ");
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw004pro\\task002\\AnotherFile.txt")) {
            int count;
            while ((count = fileInputStream.read()) != -1) {
                System.out.print((char) count);
            }
        } catch (IOException e) {
            System.err.println("Что-то пошло не так. Простите.");
        }
    }
}
