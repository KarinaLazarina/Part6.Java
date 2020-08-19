package HW3.task5;

public class Multiply implements Calculator {

    public Multiply() {
    }

    @Override
    public void calculate(int a, int b) {
        System.out.println(a*b);
    }
}
