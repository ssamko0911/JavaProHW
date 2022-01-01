package homeworktocheck.hw007pro.taskadditional;

import java.lang.reflect.Field;

public class Cat {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<?> classInstance = Animal.class;
        Animal animal = new Animal();
        Field fieldOne = classInstance.getDeclaredField("name");
        fieldOne.setAccessible(true);
        System.out.println("Поле name.\nТекущее значение поля: " + fieldOne.get(animal));
        fieldOne.set(animal, "Волк");
        System.out.println("Новое значение поля: " + fieldOne.get(animal));
        System.out.println();
        Field fieldTwo = classInstance.getField("age");
        System.out.println("Поле age.\nТекущее значение поля: " + fieldTwo.getInt(animal));
        fieldTwo.setInt(animal, 5);
        System.out.println("Новое значение поля: " + fieldTwo.getInt(animal));
        System.out.println();
        Field fieldThree = classInstance.getDeclaredField("weight");
        fieldThree.setAccessible(true);
        System.out.println("Поле weight.\nТекущее значение поля: " + fieldThree.getDouble(animal));
        fieldThree.set(animal, 10.0);
        System.out.println("Новое значение поля: " + fieldThree.getDouble(animal));
    }
}