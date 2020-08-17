package HW2.task1;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Pet pet;
    private Mail email;

    public Person(String name, String surname, int age, Pet pet, Mail email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pet = pet;
        this.email = email;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Mail getEmail() {
        return email;
    }

    public void setEmail(Mail email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                ", email=" + email +
                '}';
    }

}
