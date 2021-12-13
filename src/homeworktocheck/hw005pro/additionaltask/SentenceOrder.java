package homeworktocheck.hw005pro.additionaltask;

/*
Задание 2
В каждом предложении текста поменять местами первое слово с последним, не изменяя длины
предложения.
*/

public class SentenceOrder {
    public static void main(String[] args) {
        String text = "Без труда не вынешь рыбки из пруда. Цыплят по осени считают. От сказанного слова не отвяжешься. Перекусишь на привале, а потом опять пойдешь.";
        System.out.println("Вводный текст:");
        System.out.println("=".repeat(140));
        System.out.println(text);
        System.out.println("=".repeat(140));
        System.out.println("Результат работы программы: ");
        System.out.println("=".repeat(45));
        String[] arreyOfStrings = text.split("\\.");
        for (String arreyOfString : arreyOfStrings) {
            String[] tempArray = arreyOfString.split(" ");
            String tempElement = tempArray[0];
            tempArray[0] = tempArray[tempArray.length - 1];
            tempArray[tempArray.length - 1] = tempElement;
            for (int i = 0; i < tempArray.length; i++) {
                if (i != tempArray.length - 1) {
                    System.out.print(tempArray[i] + " ");
                } else {
                    System.out.print(tempArray[i] + ".");
                }
            }
            System.out.println();
        }
        System.out.println("=".repeat(45));
    }
}
