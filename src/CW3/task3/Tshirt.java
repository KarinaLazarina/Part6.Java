package CW3.task3;

public class Tshirt extends Clothes implements WomanClothes,ManClothes{
    @Override
    public void dressMan() {
        System.out.println("Man wear Tsirt");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman wear Tsirt");
    }

    public Tshirt(Size size, Double price, String color) {
        super(size, price, color);
    }

    public Tshirt() {
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
