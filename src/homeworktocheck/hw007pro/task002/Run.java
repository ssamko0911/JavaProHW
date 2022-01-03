package homeworktocheck.hw007pro.task002;

/*
Задание 2
Напишите программу, которая будет выводить всю информацию о классе, пользователь сам выбирает, какой
именно класс интересует. 
*/

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("Введите название класса для просмотра информации (например, Java.Lang.Array):");
        showClassInfo(new Scanner(System.in).nextLine());
    }

    public static void showClassInfo(String className) {
        Class<?> cl = className.getClass();
        System.out.println("\u001B[32m" + "Анализ класса: " + "\u001B[0m" + cl);
        System.out.println("\u001B[32m" + "\tПоля класса: " + "\u001B[0m");
        Field[] fields = cl.getDeclaredFields();
        for (Field element : fields) {
            Class<?> fieldInfo = element.getType();
            System.out.println("\t\tИмя: " + element.getName());
            System.out.println("\t\tТип: " + fieldInfo.getName());
            repeatLine(60);
        }

        System.out.println("\u001B[32m" + "\tМетоды класса: " + "\u001B[0m");
        Method[] methods = cl.getDeclaredMethods();
        for (Method element : methods) {
            System.out.println("\t\tИмя: " + element.getName());
            System.out.println("\t\tТип возвращаемого значения: " + element.getReturnType().getName());
            Class<?>[] parameters = element.getParameterTypes();
            for (Class<?> parametersElement : parameters) {
                System.out.print("\t\tПринимает типы параметров: " + parametersElement.getName() + "\n");
            }
            repeatLine(60);
        }

        int modifiers = cl.getModifiers();
        System.out.println("\u001B[32m" + "\tТипы модификаторов класса: " + "\u001B[0m");
        if (Modifier.isAbstract(modifiers)) {
            System.out.println("\t\tAbstract\n");
        }
        if (Modifier.isPrivate(modifiers)) {
            System.out.println("\t\tPrivate\n");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.println("\t\tFinal\n");
        }
        if (Modifier.isStatic(modifiers)) {
            System.out.print("\t\tStatic\n");
        }
        repeatLine(60);
    }

    public static void repeatLine(int numberOfRepeats) {
        System.out.println("=".repeat(numberOfRepeats));
    }
}