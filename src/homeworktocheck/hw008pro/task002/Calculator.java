package homeworktocheck.hw008pro.task002;

import java.util.Scanner;

/**
 * @author Sergey
 * @version 1.0
 */
public class Calculator {

    /**
     * to achieve a math operator;
     */
    String operation;

    /**
     * This is constructor to initialize a Calc Object.
     */
    public Calculator() {

    }

    @MyAnnotation(num1 = 9, num2 = 12)
    /**
     * This is method which include the whole calc magic.
     * @return void
     */
    public void calc(int num1, int num2) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите знак операции: +, -, * или / (при некорректном выборе программа завершит работу): ");
        operation = in.next();
        switch (operation) {
            case "+":
                System.out.printf("Результат сложения: %d", num1 + num2);
                break;
            case "-":
                System.out.printf("Результат вычитания: %d", num1 - num2);
                break;
            case "*":
                System.out.printf("Результат умножения: %d", num1 * num2);
                break;
            case "/":
                try {
                    System.out.printf("Результат деления: %d", num1 / num2);
                } catch (ArithmeticException exception) {
                    System.err.println("На нуль делить нельзя");
                    System.out.println(exception.getMessage());
                }
                break;
            default:
                System.out.println("Некорректный выбор математического оператора, работа программы завершена.");
                break;
        }
    }
}