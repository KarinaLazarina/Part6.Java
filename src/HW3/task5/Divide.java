package HW3.task5;

public class Divide implements Calculator {

    public Divide() {
    }

    @Override
    public void calculate(int a, int b) {
        System.out.println(a/b);
    }
}
