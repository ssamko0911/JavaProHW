package howeworktocheck.hw003pro;

/*
Задание 2
Программа определяет, какая семья (фамилия) живёт в городе:
Пример ввода:
 Москва
 Ивановы
 Киев
 Петровы
 Лондон
 Абрамовичи

 Лондон
Пример вывода:
 Абрамовичи
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CitiesFamilies {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Map <String, String> livingMap = new HashMap<>();
        livingMap.put(readCityData(), readFamilyData());
        livingMap.put(readCityData(), readFamilyData());
        livingMap.put(readCityData(), readFamilyData());
        System.out.println("Укажите город, чтобы узнать какая семья в нём проживает: ");
        familyCheckByCity(in.nextLine(), livingMap);
        in.close();
    }

    public static String readCityData () {
        System.out.println("Введите город: ");
        return in.nextLine();
    }
    public static String readFamilyData () {
        System.out.println("Введите фамилию семьи: ");
        return in.nextLine();
    }

    public static void familyCheckByCity (String someString, Map <String, String> someMap) {
        System.out.printf("В указанном городе проживает семья %s.", someMap.get(someString));
    }
}