package HW1;

public class User {
    int id = 0;
    String name;
    double weight;
    int age;
    boolean isMarried = false;
    String phoneNumber;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", isMarried=" + isMarried +
                ", phoneNumber=" + phoneNumber +
                '}';
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public User(int id, String name, double weight, int age, boolean isMarried, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.isMarried = isMarried;
        this.phoneNumber = phoneNumber;
    }
}
