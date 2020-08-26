package CW3.task3;

public abstract class Clothes {
    Size size;
    Double price;
    String color;

    public Clothes(Size size, Double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Clothes() {
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
