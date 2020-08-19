package HW3.task4;

public class Laptop extends Computer {
    private double price;

    public Laptop(int id, double price) {
        super(id);
        this.price = price;
    }

    public Laptop() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
