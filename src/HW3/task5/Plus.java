package HW3.task5;

public class Plus implements Calculator {

    public Plus() {
    }

    @Override
    public void calculate(int a, int b) {
        System.out.println(a+b);
    }
}
