package homeworktocheck.hw008pro.taskadditional;

import java.lang.annotation.*;

/**
 * Annotation to sum up numbers.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MathAnnos.class)
public @interface MathAnno {
    int num1() default 0;
    int num2() default 0;
}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MathAnnos {
    MathAnno[] value();
}