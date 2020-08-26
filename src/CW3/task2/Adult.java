package CW3.task2;

public class Adult implements Runner,Singer{
    private String name;
    private int age;

    public Adult() {
    }

    public Adult(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Run every morning");
    }

    @Override
    public void sing() {
        System.out.println("Sing on the classes");
    }
}
