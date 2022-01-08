package homeworktocheck.hw008pro.taskadditional;

/*
Задание
Создать свою аннотацию используя аннотацию @Repeteable с Java 8, вызвать дважды аннотацию подтягивая
разные параметры выполнить сложение 2-х чисел.
@MathAnno(num1 = 50)
@MathAnno(num2 = 100)
public void mathSum(int num1, int num2)
*/

import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) throws NoSuchMethodException {
        // Склоннен считать, что задание сформулировано достаточно пространно. Текущее решение может не соответствовать постановке задачи;
        SumClass sumClassInstance = new SumClass();
        Class<?> classInstance = sumClassInstance.getClass();
        Method method = classInstance.getDeclaredMethod("addSum", int.class, int.class);
        MathAnnos mathAnnos = method.getDeclaredAnnotation(MathAnnos.class);
        for (MathAnno mathanno : mathAnnos.value()) {
            sumClassInstance.addSum(mathanno.num1(), mathanno.num2());
        }
    }
}