package HW3.task3;

public class Main {
    public static void main(String[] args) {
        Animal wild = new WildAnimal(); //id
        wild.eat();

        WildAnimal wld = new WildAnimal(); //id,name
        wld.eat();
        wld.searchHome();

        WildAnimal wolf = new Wolf(); //id,name
        wolf.searchHome();
        wolf.eat();

        Wolf wolf2 = new Wolf(); //id, name, home
        wolf2.howl();

        Pet cat = new Cat(); //id, name
        cat.revenge();
        cat.eat();

        Cat cat2 = new Cat();
        cat2.scratch();

    }
}
