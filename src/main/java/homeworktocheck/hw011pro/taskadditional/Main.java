package homeworktocheck.hw011pro.taskadditional;

/*
Задание
Создайте классы Currency, Parser, Main
Подключиться к NBU API(https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json)
и вывести в консоль 3 валюты на выбор
 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Parser.parseJSON("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    }
}