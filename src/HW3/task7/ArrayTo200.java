package HW3.task7;

import java.util.ArrayList;

public class ArrayTo200 implements Creator{

    private int x = Creator.x;
    private int lenght;

    public ArrayTo200(int lenght) {
        this.lenght = lenght;
    }

    public ArrayTo200() {
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public ArrayList<Integer> create() {
        int lenght = this.lenght;
        int x = this.x;

        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < lenght; i++){
            list.add((int)(Math.random()*x));
        }

        return list;
    }
}
