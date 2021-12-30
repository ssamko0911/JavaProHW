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
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinLinkedList {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<Integer> list = new LinkedList<>();
        System.out.println("Введите количество элементов связанного списка: ");
        System.out.printf("Минимальное значение равно: %d.", getMinimum(getIntegerList(Integer.parseInt(in.readLine()), list)));
        in.close();
    }

    public static List<Integer> getIntegerList(int numberOfElements, List<Integer> someList) throws IOException {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.printf("Введите %dе значение коллекции:\n", i + 1);
            someList.add(Integer.parseInt(in.readLine()));
        }
        return someList;
    }

//    public static Integer getMinimum(List<Integer> someList) {
//        int minimum = someList.get(0);
//        for (Integer integer : someList) {
//            if (integer < minimum) {
//                minimum = integer;
//            }
//        }
//        return minimum;
//    }

//    public static Integer getMinimum(List<Integer> someList) {
//        try {
//            if (someList. size() == 0){
//                throw new IOException();
//            }
//        } catch (IOException exception) {
//            System.out.println(exception + "\u001B[31m" + " - Значения для поиска минимума отсутствуют.");
//        }
//            return Collections.min(someList);
//    }

//    public static Integer getMinimum(List<Integer> someList) {
//        try {
//            if (someList. size() == 0){
//                throw new IOException();
//            }
//        } catch (IOException exception) {
//            System.out.println(exception + "\u001B[31m" + " - Значения для поиска минимума отсутствуют.");
//        }
//        return someList.stream().reduce(Integer.MAX_VALUE, Integer::min);
//    }

//    public static Integer getMinimum(List<Integer> someList) {
//        try {
//            if (someList. size() == 0){
//                throw new IOException();
//            }
//        } catch (IOException exception) {
//            System.out.println(exception + "\u001B[31m" + " - Значения для поиска минимума отсутствуют.");
//        }
//        return someList.stream().min(Integer::compare).get();
//    }

    public static Integer getMinimum(List<Integer> someList) {
        try {
            if (someList. size() == 0){
                throw new IOException();
            }
        } catch (IOException exception) {
            System.out.println(exception + "\u001B[31m" + " - Значения для поиска минимума отсутствуют.");
        }

        return someList.stream()
                .filter(someDigit->someDigit<Integer.MAX_VALUE)
                .min(Integer::compare).get();
    }
}