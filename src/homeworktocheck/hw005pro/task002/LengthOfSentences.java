package homeworktocheck.hw005pro.task002;
/*
Задание
Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них
*/

import java.util.*;

public class LengthOfSentences {
    public static void main(String[] args) {
        String text = "Без труда не вынешь рыбки из пруда. Цыплят по осени считают. От сказанного слова не отвяжешься. Перекусишь на привале, а потом опять пойдешь.";
        String[] strings = text.split("\\. ");
        for (String string : strings) {
            System.out.println(string); // Вывод массива для проверки;
        }

        HashMap<String, Integer> countWords = new HashMap<>();
        for (String string : strings) {
            int count = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == ' ') {
                    count++;
                }
            }
            countWords.put(string, count + 1);
        }

        System.out.println();
        countWords.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
