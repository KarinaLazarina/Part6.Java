package HW2.task1;

public class Pet {
    String name;
    int age;

    public Pet() {
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Gav(){
        System.out.println("gav-gav!!!");
    }

    public void Pee(){
        System.out.println("peeeeeeeeeee");
    }


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}

