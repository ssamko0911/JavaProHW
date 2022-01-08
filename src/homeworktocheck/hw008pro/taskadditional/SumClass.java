package homeworktocheck.hw008pro.taskadditional;

public class SumClass {
    @MathAnno(num1 = 50)
    @MathAnno(num2 = 100)
    @MathAnno(num1 = 50, num2 = 100)
    public void addSum(int num1, int num2){
        System.out.printf("Результат сложения 2х чисел: %d\n", num1 + num2);
    }
}