package HW2.task2;

import java.util.ArrayList;

public class Department {
    private String title;
    private ArrayList<Worker> workers;

    public Department() {
    }

    public Department(String title, ArrayList<Worker> workers) {
        this.title = title;
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "title='" + title + '\'' +
                ", workers=" + workers +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }
}
