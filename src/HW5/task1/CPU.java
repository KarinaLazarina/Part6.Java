package HW5.task1;

import java.util.Objects;

public class CPU {
    private String type;
    private int numberOfCores;
    private Producer producer;

    @Override
    public String toString() {
        return "CPU{" +
                "type='" + type + '\'' +
                ", numberOfCores=" + numberOfCores +
                ", producer=" + producer +
                '}';
    }

    public CPU() {
    }

    public CPU(String type, int numberOfCores, Producer producer) {
        this.type = type;
        this.numberOfCores = numberOfCores;
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu = (CPU) o;
        return numberOfCores == cpu.numberOfCores &&
                type.equals(cpu.type) &&
                producer == cpu.producer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, numberOfCores, producer);
    }
}

