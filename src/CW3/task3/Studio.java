package CW3.task3;

import java.util.ArrayList;

public class Studio {
    ArrayList<Clothes> clothes;

    public Studio(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public Studio() {
    }

    ArrayList<Clothes> ManChoice(){
        ArrayList<Clothes> clothesArrayList = new ArrayList<>();
        for (Clothes clothe : clothes) {
            if(clothe instanceof ManClothes){
                clothesArrayList.add(clothe);
            }
        }
        return clothesArrayList;
    };

    ArrayList<Clothes> WomanChoice(){
        ArrayList<Clothes> clothesArrayList = new ArrayList<>();
        for (Clothes clothe : clothes) {
            if(clothe instanceof WomanClothes){
                clothesArrayList.add(clothe);
            }
        }
        return clothesArrayList;
    };

}
