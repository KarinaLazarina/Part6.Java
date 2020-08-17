package HW2.task2;

import HW1.Prince;

import java.util.ArrayList;

public class Company {
    private String title;
    private ArrayList<Department> departments;

    public Company(String title, ArrayList<Department> departments) {
        this.title = title;
        this.departments = departments;
    }

    public Company() {
    }

    @Override
    public String toString() {
        return "Company{" +
                "title='" + title + '\'' +
                ", departments=" + departments +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
}
