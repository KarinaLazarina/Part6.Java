package CW5.task1;

import java.util.Objects;

public class Car {
    private String marka;
    private double power;
    private int price;
    private int year;
    private Driver driver;



    public Car() {
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", power=" + power +
                ", price=" + price +
                ", year=" + year +
                ", driver=" + driver +
                '}';
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car(String marka, double power, int price, int year, Driver driver) {
        this.marka = marka;
        this.power = power;
        this.price = price;
        this.year = year;
        this.driver = driver;
    }

    public Car(String marka, double power, int price, int year) {
        this.marka = marka;
        this.power = power;
        this.price = price;
        this.year = year;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.power, power) == 0 &&
                price == car.price &&
                year == car.year &&
                Objects.equals(marka, car.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, power, price, year);
    }
}
