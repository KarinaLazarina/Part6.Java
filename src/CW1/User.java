package CW1;

import java.sql.Array;
import java.util.Arrays;

public class User {
    int id;
    String name;
    String surname;
    int age;
    Car[] cars;
    boolean isMarried = false;
    String[] skills;
    String phoneNumber;
    Pet[] pets;
    User wife = null;
    Pet favouritePet;

    public User() {
    }

    public User(int id, String name, String surname, int age, Car[] cars, boolean isMarried, String[] skills, String phoneNumber, Pet[] pets, User wife, String type, String FPname, double FPweight, int FPage) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cars = cars;
        this.isMarried = isMarried;
        //System.out.println(Arrays.toString(this.skills));
        if (skills[2] == null){
            System.out.println("Error");
        }else {
            System.out.println("good");
            this.skills = skills;
        }
        this.phoneNumber = phoneNumber;
        this.pets = pets;
        this.wife = wife;
        this.favouritePet = new Pet(type,FPname,FPweight,FPage);
        //this.pet = new Pet()
    }

    public Pet getFavouritePet() {
        return favouritePet;
    }

    public void setFavouritePet(Pet favouritePet) {
        this.favouritePet = favouritePet;
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

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String  getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public User getWife() {
        return wife;
    }

    public void setWife(User wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", cars=" + Arrays.toString(cars) +
                ", isMarried=" + isMarried +
                ", skills=" + Arrays.toString(skills) +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pets=" + Arrays.toString(pets) +
                ", wife=" + wife +
                ", favouritePet=" + favouritePet +
                '}';
    }
}
