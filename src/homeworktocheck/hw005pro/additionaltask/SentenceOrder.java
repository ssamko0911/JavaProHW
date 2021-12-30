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
        repeatSymbols(140);
        System.out.println(text);
        repeatSymbols(140);
        System.out.println("Результат работы программы: ");
        repeatSymbols(45);
        String[] arreyOfStrings = text.split("[. ] | [? ] | [! ]");
        for (int i = 0; i < arreyOfStrings.length; i++) {
            String[] tempArray = arreyOfStrings[i].split("\\ ");
            String tempElement = tempArray[0];
            tempArray[0] = tempArray[tempArray.length - 1];
            tempArray[tempArray.length - 1] = tempElement;
            for (String str : tempArray) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
        repeatSymbols(45);
    }

    public static void repeatSymbols(int numberOfRepeat) {
        System.out.println("=".repeat(numberOfRepeat));
    }
}