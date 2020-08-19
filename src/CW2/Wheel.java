package CW2;

public class Wheel {
    String producer;
    int diametr;

    public Wheel() {
    }

    public Wheel(String producer, int diametr) {
        this.producer = producer;
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "producer='" + producer + '\'' +
                ", diametr=" + diametr +
                '}';
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }
}
