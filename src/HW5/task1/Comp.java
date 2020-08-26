package HW5.task1;

import java.util.Objects;

public class Comp implements Comparable<Comp>{
    private String model;
    private int year;
    private int memory;
    private double price;
    private HardDisk hardDisk;
    private CPU cpu;

    @Override
    public String toString() {
        return "Comp{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", memory=" + memory +
                ", price=" + price +
                ", hardDisk=" + hardDisk +
                ", cpu=" + cpu +
                '}';
    }

    public Comp(String model, int year, int memory, double price, HardDisk hardDisk, CPU cpu) {
        this.model = model;
        this.year = year;
        this.memory = memory;
        this.price = price;
        this.hardDisk = hardDisk;
        this.cpu = cpu;
    }

    public Comp() {
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

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comp comp = (Comp) o;
        return year == comp.year &&
                memory == comp.memory &&
                Double.compare(comp.price, price) == 0 &&
                Objects.equals(model, comp.model) &&
                Objects.equals(hardDisk, comp.hardDisk) &&
                Objects.equals(cpu, comp.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, memory, price, hardDisk, cpu);
    }

    @Override
    public int compareTo(Comp o) {
        return (int) (this.price - o.price);
    }
}
