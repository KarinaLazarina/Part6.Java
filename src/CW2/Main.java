package CW2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        //Зробити список з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та:
//        int[] arr = {2,17,13,6,22,31,45,66,100,-18};
//
//        //1. Перебрати його циклом while
//        int i =0;
//        while (i<arr.length){
//            System.out.println(arr[i]);
//            i++;
//        }
//
//        System.out.println("--------------");
//        //2. перебрати його циклом for
//        for (i = 0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("--------------");
//        //3. перебрати циклом while та вивести  числа тільки з непарним індексом
//        i=0;
//        while (i<arr.length){
//            if (i%2 != 0){
//                System.out.println(arr[i]);
//            }
//            i++;
//        }
//
//        System.out.println("--------------");
//        //4. перебрати циклом for та вивести  числа тільки з непарним індексом
//        for(i=0;i<arr.length;i++){
//            if (i%2 != 0){
//                System.out.println(arr[i]);
//            }
//        }
//
//        System.out.println("--------------");
//        //5. перебрати циклом while та вивести  числа тільки парні  значення
//        i=0;
//        while (i<arr.length){
//            if (i%2 == 0){
//                System.out.println(arr[i]);
//            }
//            i++;
//        }
//
//        System.out.println("--------------");
//        //6. перебрати циклом for та вивести  числа тільки парні  значення
//        for(i=0;i<arr.length;i++){
//            if (i%2 == 0){
//                System.out.println(arr[i]);
//            }
//        }
//
//        System.out.println("--------------");
//        //8. Вивести список в зворотньому порядку.
//        for (i = arr.length-1; i>=0; i--){
//            System.out.println(arr[i]);
//        }

//        //Створити пустий список та :
//        ArrayList<Integer> list1 = new ArrayList<>();
//        //1. Заповнити його 50 парними числами.
//        for (int i = 0; i<50; i++){
//            list1.add((int)(Math.random()*100)*2);
//        }
//        System.out.println(list1);
//        //2. Заповнити його 50 непарними числами.
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for (int i = 0, num = 1; i<50; i++, num +=2){
//
//            list2.add(num);
//        }
//        System.out.println(list2);

//        // 1. используя Math.random заполнить список 100 элементами.
//        // диапазон рандома от -999 до 999.
//        int[] list = new int[100];
//        for (int i = 0; i< list.length; i++) {
//            list[i] = (int)((Math.random() * 1999) - 999);
//            System.out.println(list[i]);
//        }
//
//        System.out.println("---------------");
//        // 2. Вывести на консоль  каждый третий елемент
//        for (int i = 0; i<100; i++){
//            if (i%3 == 0){
//                System.out.println(list[i]);
//            }
//        }
//
//        System.out.println("---------------");
//        // 3. Вывести на консоль  каждый третий елемент
//        // но при условии что он имеет парное значение.
//        for (int i = 0; i<100; i++){
//            if (i%3 == 0 && list[i]%2 == 0){
//                System.out.println(list[i]);
//            }
//        }
//
//        System.out.println("---------------");
//        // 4. Вывести на консоль  каждый третий елемент
//        // но при условии что он имеет парное значение и
//        // записать их в другой список.
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        for (int i = 0, j = 0; i < 100; i++){
//            if (i%3 == 0 && list[i]%2 == 0){
//                list2.add(list[i]);
//            }
//        }
//        System.out.println(list2);

        //є класс авто
        //поля
        // - модель
        // - рік
        // - номер
        // - колір
        // - Двигун (к)
        //	- модель
        //	- об'єм
        //	- кінські сили
        // - Колесо (к)
        //	-виробник
        //	-діаметр

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("bmw",
                2001,
                449,
                "white",
                new Engine("kkk",
                        3,
                        100,
                        new Wheel("bmw",15))));
        cars.add(new Car("bmw",
                1999,
                549,
                "white",
                new Engine("kkk",
                        3,
                        100,
                        new Wheel("bmw",17))));

        for (Car car : cars) {
            if(car.getYear() < 2000){
                int diametr = car.getEngine().wheel.getDiametr();
                car.getEngine().wheel.setDiametr(diametr-1);
            }
        }

        //Пройтись по коллекції, всі автівки які меньше 2000 року
        //змінити радіус колеса на одн меньше від поточного
        //всі автівки які старіше 2000 року пепефарбувати в зелений

  }
    
}
