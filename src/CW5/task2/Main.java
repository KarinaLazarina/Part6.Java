package CW5.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Задача: дан отсортированный по возрастанию массив целых чисел.
        // Необходимо вернуть наименьший и
        // наибольший индекс заданного элемента.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(10);

        System.out.println(list.indexOf(4));
        System.out.println(list.lastIndexOf(4));

    }
}
