package homeworktocheck.hw004pro.task003;

import java.io.*;
import java.util.Arrays;

public class CreateFile {
    public static void main(String[] args) {
        int[] arrayOfDigits = new int[20];
        String fileName = "C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw004pro\\task003\\NewFile.txt";

        for (int i = 0; i < arrayOfDigits.length; i++) {
            arrayOfDigits[i] = (int) (Math.random() * (100 - 10) + 10);
        }
        Arrays.sort(arrayOfDigits);
        System.out.println("Массив отсортирован.\nВывод массива для сверки с записью в файл: ");

        for (int i = 0; i < arrayOfDigits.length; i++) { // печать значений для проверки записи в файл.
            if (i != arrayOfDigits.length - 1) {
                System.out.print(arrayOfDigits[i] + " | ");
            } else {
                System.out.print(arrayOfDigits[i]);
            }
        }

        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            for (int arrayOfDigit : arrayOfDigits) {
                String arrayToWrite = arrayOfDigit + "\t";
                fileWriter.write(arrayToWrite);
            }
            System.out.println("\nЗначения записаны в файл.");
        } catch (IOException e) {
            System.err.println("Что-то пошло не так. Простите.");
            System.out.println(e.getMessage());
        }
    }
}