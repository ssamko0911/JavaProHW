package homeworktocheck.hw007pro.task003;

/*
Задание 3
Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы.
Под средством рефлексии получите всю информацию о полях, методах, конструкторах, а также
модификаторах доступа
*/

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Run {

    private static class Person {
        String name = "Sergey";
        int age = 37;
        double weight = 67.5;

        public Person() {

        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> instanceOne = Person.class;
        System.out.println("\u001B[32m" + "Анализ класса: " + "\u001B[0m" + instanceOne);

        System.out.println("\u001B[32m" + "\tПоля класса: " + "\u001B[0m");
        Field[] fields = instanceOne.getDeclaredFields();
        for (Field element : fields) {
            Class<?> fieldInfo = element.getType();
            System.out.println("\t\tИмя: " + element.getName());
            System.out.println("\t\tТип: " + fieldInfo.getName());
            repeatLine(60);
        }

        System.out.println("\u001B[32m" + "\tМетоды класса: " + "\u001B[0m");
        Method[] methods = instanceOne.getDeclaredMethods();
        for (Method element : methods) {
            System.out.println("\t\tИмя: " + element.getName());
            System.out.println("\t\tТип возвращаемого значения: " + element.getReturnType().getName());
            Class<?>[] parameters = element.getParameterTypes();
            for (Class<?> parametersElement : parameters) {
                System.out.print("\t\tПринимает типы параметров: " + parametersElement.getName() + "\n");
            }
            repeatLine(60);
        }

        int modifiers = instanceOne.getModifiers();
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