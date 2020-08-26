package CW3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Singer child1 = new Child("Vasya",6);
        Runner child2 = new Child("Olya",10);
        Singer child3 = new Child("Ira",8);
        Singer adult1 = new Adult("Yura",29);
        Runner adult2 = new Adult("Katya",45);

        ArrayList<Singer> singers = new ArrayList<>();
        singers.add(child1);
        singers.add(child3);
        singers.add(adult1);

        ArrayList<Runner> runners = new ArrayList<>();
        runners.add(child2);
        runners.add(adult2);

        child1.sing();
        child2.run();
        adult1.sing();
        adult2.run();

    }
}
