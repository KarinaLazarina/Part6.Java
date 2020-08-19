package HW3.task5;

public class Main {
    public static void main(String[] args) {

        Plus plus = new Plus();
        plus.calculate(3,8);

        Calculator divide = new Divide();
        divide.calculate(36,4);

        Calculator minus = new Minus();
        minus.calculate(6,9);

        new Multiply().calculate(2,4);

    }
}
