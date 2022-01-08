package homeworktocheck.hw008pro.task002;

import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) throws NoSuchMethodException {
        Calculator calculator = new Calculator();
        Class<?> classInstance = calculator.getClass();
        Method method = classInstance.getMethod("calc", int.class, int.class);
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        calculator.calc(annotation.num1(), annotation.num2());
    }
}