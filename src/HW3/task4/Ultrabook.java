package HW3.task4;

public class Ultrabook extends Laptop {
    private String nameOfUser;
    private String producer;

    public Ultrabook(int id, double price, String nameOfUser, String producer) {
        super(id, price);
        this.nameOfUser = nameOfUser;
        this.producer = producer;
    }

    public Ultrabook() {
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
