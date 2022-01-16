package homeworktocheck.hw008pro.task003;

import java.lang.annotation.Annotation;

public class Run {
    public static void main(String[] args) {
        System.out.println("\nИнформация о родительских аннотациях: ");
        Human human = new Human();
        for (Annotation annotation : human.getClass().getAnnotations()){
            System.out.println(annotation);
        }
        System.out.println("\nИнформация о аннотациях, которые унаследованы от родительского класса: ");
        Person person = new Person();
        for (Annotation annotation : person.getClass().getAnnotations()){
            System.out.println(annotation);
        }
    }
}