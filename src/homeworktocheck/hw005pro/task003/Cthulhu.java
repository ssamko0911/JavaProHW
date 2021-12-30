package homeworktocheck.hw005pro.task003;

public class Cthulhu {
    public static void main(String[] args) {
        String someString = """
                По́клик Кту́лху (The Call of Cthulhu) — це містичне оповідання Говарда Лавкрафта,
                написане в 1926 році і вперше видане в 1928 в журналі Weird Tales.
                Оповідання складається з трьох пов'язаних між собою частин, які подано як нотатки Френсіса Терстона, жителя Бостона,
                який займався розслідуваннями, пов'язаними з культом божества Ктулху.""";

        String firstPart = someString.substring(0, someString.length() / 2);
        System.out.printf("Часть 1:\n %s", firstPart);
        System.out.println();
        repeatSymbols(50);
        System.out.printf("\nЁмкость: %d.\n", firstPart.length());
        repeatSymbols(50);
        System.out.println();
        String secondPart = someString.substring(someString.length() / 2);
        System.out.printf("\nЧасть 2:\n %s\n", secondPart);
        repeatSymbols(50);
        System.out.printf("\nЁмкость: %d.\n", secondPart.length());
        repeatSymbols(50);
    }

    public static void repeatSymbols(int numberOfRepeat) {
        System.out.println("=".repeat(numberOfRepeat));
    }
}