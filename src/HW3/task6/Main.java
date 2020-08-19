package HW3.task6;

public class Main {

    public static void main(String[] args) {
        Class1 class1 = new Class1("aaaaaaaaaaaa!!!");
        Class2 class2 = new Class2("yyyyyyyy");

        //В головному класі. створити метод, котрий приймає об'єкт цього інтерфейсу і виконує його метод
//        void screamOfClass(Scream class){
//            class.scream();
//        }
        //что делаю не так?

        class1.scream();
        class2.scream();
    }
}
