package homework.tocheck.hw001pro.task002;

/*
Задание 2
Вывод на экран элементов List:
Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {

    public static final int LIMIT_OF_LIST_ELEMENTS = 10;

    public static void main(String[] args) {
        List<Monitor> listOfMonitors = new ArrayList<>();
        for (int i = 1; i <= LIMIT_OF_LIST_ELEMENTS; i++) {
            listOfMonitors.add(new Monitor("Модель " + i, ((int) (Math.random() * 100))));
        }
        Iterator <Monitor> iterator = listOfMonitors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
