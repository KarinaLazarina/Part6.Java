package CW1;

public class Car {
    int userId;
    double price;
    String model;
    String driverName;

    public Car() {
    }

    public Car(int userId, double price, String model, String driverName) {
        this.userId = userId;
        this.price = price;
        this.model = model;
        this.driverName = driverName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "userId=" + userId +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", driverName='" + driverName + '\'' +
                '}';
    }
}
