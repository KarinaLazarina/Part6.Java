package HW2.task3;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Yura",
                "Naumov",
                "25.05.1990",
                new Pasport("NK",123456,"kem-to tam vydan"));
        Request request1 = new Request(1,
                "12.08.2020",
                new Type("Complaint"),
                client);

        System.out.println(request1);
    }
}
