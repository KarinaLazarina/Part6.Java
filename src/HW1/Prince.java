package HW1;

public class Prince {
    int id = 0;
    String name;
    int age;
    double sizeOfShoe;

    public Prince() {
    }

    public Prince(int id, String name, int age, double sizeOfShoe) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sizeOfShoe = sizeOfShoe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSizeOfShoe() {
        return sizeOfShoe;
    }

    public void setSizeOfShoe(double sizeOfShoe) {
        this.sizeOfShoe = sizeOfShoe;
    }
}
