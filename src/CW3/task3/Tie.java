package CW3.task3;

public class Tie extends Clothes implements ManClothes {
    @Override
    public void dressMan() {
        System.out.println("Man wear tie");
    }

    public Tie(Size size, Double price, String color) {
        super(size, price, color);
    }

    public Tie() {
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
