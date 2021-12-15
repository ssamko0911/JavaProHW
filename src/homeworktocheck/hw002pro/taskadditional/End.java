package homeworktocheck.hw002pro.taskadditional;

/*
Задание
Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
1. Создать список строк.
2. Ввести строки с клавиатуры и добавить их в список.
3. Вводить с клавиатуры строки, пока пользователь не введёт строку "end". "end" не учитывать.
4. Вывести строки на экран, каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class End {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ArrayList<String> listOfStrings = new ArrayList<>();
        while (true) {
            System.out.println("Вводите любые строки: ");
            String stringToAdd = in.readLine();
            if (stringToAdd.equalsIgnoreCase("end")) {
                break;
            } else {
                listOfStrings.add(stringToAdd);
            }
        }
        in.close();
        System.out.println("Пользователь ввёл волшебное слово для остановки ввода.\n");

        System.out.println("Вывод списка элементов коллекции (каждый с новой строки): ");
        for (String element : listOfStrings) {
            System.out.println(element);
        }
    }
}