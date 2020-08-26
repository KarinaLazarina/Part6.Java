package CW3.task2;

public class Child implements Runner,Singer{

    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Child() {
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Run on playground");
    }

    @Override
    public void sing() {
        System.out.println("Sing everywhere!");
    }
}
