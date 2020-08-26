package HW3.task6;

public class Main {

    static void scream(Scream classs){
        classs.scream();
    }
    public static void main(String[] args) {
        Scream class1 = new Class1("aaaaaaaaaaaa!!!");
        Class2 class2 = new Class2("yyyyyyyy");

        //В головному класі. створити метод, котрий приймає об'єкт цього інтерфейсу і виконує його метод
        scream(class1);
        scream(class2);

//        class1.scream();
//        class2.scream();
    }
}
