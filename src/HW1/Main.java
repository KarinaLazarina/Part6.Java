package HW1;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(1,"HarryPotter", 15.5, "J.K.Rowling",9.3);
        System.out.println(book1);

        User user1 = new User(3,"Vanya",56.9,28,true, "380-955-73-228");
        System.out.println(user1);

        Prince prince = new Prince(1,"Kolya",34,36.5);
        Cinderella[] cinderellas = {
                new Cinderella(1,"Katya",24,38),
                new Cinderella(2,"Olya",57,40),
                new Cinderella(3,"Masha",18,36.5),
                new Cinderella(4,"Yulya",40,35.5),
                new Cinderella(5,"Vika",27,36.5)
        };

        for (Cinderella cinderella : cinderellas) {
            if (cinderella.sizeOfFoot == prince.sizeOfShoe){
                System.out.println(cinderella.name + " and " + prince.name + " are perfect couple");
                break;
            }
        }

    }
}
