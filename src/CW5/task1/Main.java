package CW5.task1;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Car> carList = new LinkedList<>();

        carList.add(new Car("bmw", 120, 7000,2012,
                    new Driver("Vasya",28,10)));
        carList.add(new Car("bmw", 140, 6500,2015,
                    new Driver("Petya",38,12)));
        carList.add(new Car("toyota", 170, 5000,2017,
                    new Driver("Yulia",48,15)));
        carList.add(new Car("bmw", 100, 75000,2010,
                    new Driver("Kostya",26,3)));
        carList.add(new Car("lada", 90, 3000,2009,
                    new Driver("Vasya",26,5)));
        carList.add(new Car("mercedes", 200, 7800,2017,
                    new Driver("Ira",29,1)));
        carList.add(new Car("mercedes", 150, 4900,2005,
                    new Driver("Kolya",48,20)));

        for (int i = 0; i <carList.size(); i+=2){
            double power = carList.get(i).getPower();
            int price = carList.get(i).getPrice();

            carList.get(i).setPower(power*0.1+power);
            carList.get(i).setPrice((int) (price*0.05+price));
        }


        carList.stream().forEach(car-> {

            if (carList.lastIndexOf(car) %2 == 0){
                double power = car.getPower();
                int price = car.getPrice();

                car.setPower(power*0.1+power);
                car.setPrice((int) (price*0.05+price));
            }
        });



        carList.stream().forEach(car -> {
            if(car.getDriver().getExp() < 5 && car.getDriver().getAge()>25){
                car.getDriver().setExp(car.getDriver().getExp()+1);
            }
        });
        System.out.println(carList);

        System.out.println(carList.stream().mapToInt(s -> s.getPrice()).sum());



    }
}
