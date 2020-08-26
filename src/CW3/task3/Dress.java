package CW3.task3;

public class Dress extends Clothes implements WomanClothes{
    @Override
    public void dressWoman() {
        System.out.println("Woman wear dress");
    }

    public Dress() {
    }

    public Dress(Size size, Double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Dress{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
