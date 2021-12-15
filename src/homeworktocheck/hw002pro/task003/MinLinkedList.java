package homeworktocheck.hw002pro.task003;

/*
Задание 3
Минимальное из N чисел(использовать LinkedList):
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class MinLinkedList {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Введите количество элементов связанного списка: ");
        System.out.printf("Минимальное значение равно: %d.", getMinimum(getIntegerList(Integer.parseInt(in.readLine()), list)));
    }

    public static LinkedList<Integer> getIntegerList(int numberOfElements, LinkedList<Integer> someList) throws IOException {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.printf("Введите %dе значение коллекции:\n", i + 1);
            someList.add(Integer.parseInt(in.readLine()));
        }
        return someList;
    }

    public static Integer getMinimum(LinkedList<Integer> someList) {
        int minimum = someList.get(0);
        for (Integer integer : someList) {
            if (integer < minimum) {
                minimum = integer;
            }
        }
        return minimum;
    }
}