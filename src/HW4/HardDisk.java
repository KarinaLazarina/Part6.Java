package HW4;

import java.util.Objects;

public class HardDisk {
    private String model;
    private Type type;
    private double volume;
    private Producer producer;

    public HardDisk(String model, Type type, double volume, Producer producer) {
        this.model = model;
        this.type = type;
        this.volume = volume;
        this.producer = producer;
    }

    public HardDisk() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", volume=" + volume +
                ", producer=" + producer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDisk hardDisk = (HardDisk) o;
        return Double.compare(hardDisk.volume, volume) == 0 &&
                model.equals(hardDisk.model) &&
                type == hardDisk.type &&
                producer == hardDisk.producer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, volume, producer);
    }
}
