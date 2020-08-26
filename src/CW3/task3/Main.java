package CW3.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(Size.M);
        Size.L.getDescription();

        Tie tie = new Tie();
        Tshirt tshirt = new Tshirt();
        Dress dress = new Dress();
        Trousers trousers= new Trousers();

        ArrayList<Clothes> clothes = new ArrayList<>();
        clothes.add(tie);
        clothes.add(tshirt);
        clothes.add(dress);
        clothes.add(trousers);

        Studio studio = new Studio(clothes);

        System.out.println(studio.ManChoice());
        System.out.println(studio.WomanChoice());

    }
}
