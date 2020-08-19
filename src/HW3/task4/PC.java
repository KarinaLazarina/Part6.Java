package HW3.task4;

public class PC extends Computer {
    private String producer;

    public PC(int id, String producer) {
        super(id);
        this.producer = producer;
    }

    public PC() {
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}

