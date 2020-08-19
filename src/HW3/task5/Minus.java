package HW3.task5;

public class Minus implements Calculator {

    public Minus() {
    }

    @Override
    public void calculate(int a, int b) {
        if (a<b){
            System.out.println(b-a);
        }else {
            System.out.println(a-b);
        }
    }
}
