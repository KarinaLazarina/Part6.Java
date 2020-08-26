package CW3.task1;

public class Priamokutnyk implements Square{
    private double storona1;
    private double storona2;

    public double getStorona1() {
        return storona1;
    }

    public void setStorona1(double storona1) {
        this.storona1 = storona1;
    }

    public double getStorona2() {
        return storona2;
    }

    public void setStorona2(double storona2) {
        this.storona2 = storona2;
    }

    public Priamokutnyk() {
    }

    public Priamokutnyk(double storona1, double storona2) {
        this.storona1 = storona1;
        this.storona2 = storona2;
    }

    @Override
    public double square() {
        return storona1*storona2;
    }
}
