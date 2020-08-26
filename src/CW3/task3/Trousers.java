package CW3.task3;

public class Trousers extends Clothes implements WomanClothes,ManClothes {
    @Override
    public void dressMan() {
        System.out.println("Man wear trousers");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman wear trousers");
    }

    public Trousers(Size size, Double price, String color) {
        super(size, price, color);
    }

    public Trousers() {
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
