package CW1;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(1,5900,"BMW","Petya");
        Car car2 = new Car(1,4500,"Porshe","Petya");
        Car car3 = new Car(2,3500,"Lada","Katya");

        Pet[] pets = {
                new Pet("cat", "Yurik",10.4,7),
                new Pet("perrot","Kesha",0.7,4)
        };

        User wife = new User(2,
                "Katya",
                "Ivankiv",
                29,
                new Car[]{car3},
                true,
                new String[]{"drive","dance",null},
                "0973780228",
                pets,
                null,
                "cat",
                "Yurik",
                10.4,
                7);

        User user1 = new User(1,
                "Petya",
                "Ivankin",
                45,
                new Car[]{car1,car2},
                true,
                new String[]{"drive","swim","sing"},
                "0979354678",
                pets,
                wife,
                "dog",
                "Vennya",
                18.7,
                9);

        System.out.println(user1);
    }
}
