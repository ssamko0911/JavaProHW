package homeworktocheck.hw006pro.taskadditional;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPassUser {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Введите Ваш логин: ");
        String login = in.next();
        if (!checkLogin(login)) {
            System.err.println("Регистрация невозможна, логин должен состоять только из символов латинского алфавита!");
        } else {
            System.out.println("Введите Ваш пароль: ");
            String password = in.next();
            if (!checkPass(password)) {
                System.err.println("Регистрация невозможна, пароль должен состоять из символов латинского алфавита и цифр!"); // подсказки про регистр лишние;
            } else {
                System.out.println("Поздравляем, регистрация прошла успешно!");
            }
        }
    }

    public static boolean checkLogin(String someString) {
        Pattern pattern = Pattern.compile("^[A-Za-z]+$");
        Matcher matcher = pattern.matcher(someString);
        return matcher.matches();
    }

    public static boolean checkPass(String someString) {
        Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$");
        Matcher matcher = pattern.matcher(someString);
        return matcher.matches();
    }
}