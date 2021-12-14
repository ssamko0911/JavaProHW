package homeworktocheck.hw002pro.task002;

/*
Задание 2
Используя коллекцию удвойте слово:
1. Введите с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DoubleWords {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.printf("Введите %dе значение коллекции:\n", i + 1);
            list.add(in.readLine());
        }
        System.out.println("\u001B[32m" + "_".repeat(60));
        System.out.println("\u001B[0m" + "Содержимое коллекции: ");
        System.out.println("\u001B[0m" + doubleVaues(list));
        System.out.println("\u001B[32m" + "_".repeat(60));
    }

    public static List<String> doubleVaues(ArrayList<String> someList) {
        for (int i = 0; i < someList.size(); i++) {
            someList.add(i, someList.get(i));
            i++;
        }
        return someList;
    }
}