package HW2.task1;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Vasya",
                "Pupkov",
                45,
                new Pet("Nusya",2),
                new Mail("instagram", "Vasya_Lapochka","12345678")
                );

        Mail email = person1.getEmail();
        email.login(email.login,email.password);
        email.login("Vasya",email.password);

        person1.getPet().Gav();
        person1.getPet().Pee();
    }
}
