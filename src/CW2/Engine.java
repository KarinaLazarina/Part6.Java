package CW2;

public class Engine {
    // - Двигун (к)
    //	- модель
    //	- об'єм
    //	- кінські сили
    // - Колесо (к)
    //	-виробник
    //	-діаметр
    String model;
    double volume;
    int power;
    Wheel wheel;

    public Engine() {
    }

    public Engine(String model, double volume, int power, Wheel wheel) {
        this.model = model;
        this.volume = volume;
        this.power = power;
        this.wheel = wheel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                ", wheel=" + wheel +
                '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
