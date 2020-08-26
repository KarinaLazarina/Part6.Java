package CW3.task1;

public class Kvadrat implements Square{
    private double storona;

    public Kvadrat(double storona) {
        this.storona = storona;
    }

    public Kvadrat() {
    }

    public double getStorona() {
        return storona;
    }

    public void setStorona(double storona) {
        this.storona = storona;
    }

    @Override
    public double square() {
        return Math.pow(this.storona, 2);
    }
}
