package homeworktocheck.hw005pro.task003;

public class Cthulhu {
    public static void main(String[] args) {
        String someString = """
                По́клик Кту́лху (The Call of Cthulhu) — містичне оповідання Говарда Лавкрафта,
                написане в 1926 році і вперше видане в 1928 в журналі Weird Tales.
                Оповідання складається з трьох пов'язаних між собою частин, які подано як нотатки Френсіса Терстона, жителя Бостона,
                який займався розслідуваннями, пов'язаними з культом божества Ктулху.""";

        int partition = someString.length() % 2 == 0 ? someString.length() / 2 : someString.length() / 2 + 1;

        String firstPart = someString.substring(0, partition);
        System.out.printf("Часть 1:\n %s", firstPart);
        System.out.println();
        System.out.print("_".repeat(50));
        System.out.printf("\nЁмкость: %d.\n", firstPart.length());
        System.out.print("_".repeat(50));
        System.out.println();
        String secondPart = someString.substring(partition);
        System.out.printf("\nЧасть 2:\n %s\n", secondPart);
        System.out.println("_".repeat(50));
        System.out.printf("\nЁмкость: %d.\n", secondPart.length());
        System.out.println("_".repeat(50));
    }
}
