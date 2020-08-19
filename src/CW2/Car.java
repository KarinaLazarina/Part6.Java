package CW2;

public class Car {
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

    private String model;
    private int year;
    private long number;
    private String color;
    private Engine engine;

    public Car() {
    }

    public Car(String model, int year, long number, String color, Engine engine) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number=" + number +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
