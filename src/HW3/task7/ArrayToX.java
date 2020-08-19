package HW3.task7;

import java.util.ArrayList;

public class ArrayToX implements Creator{
    private int x;
    private int length;

    public ArrayToX(int x, int length) {
        this.x = x;
        this.length = length;
    }

    public ArrayToX() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public ArrayList<Integer> create() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<this.length; i++){
            list.add((int)(Math.random()*this.x));
        }
        return list;
    }
}
