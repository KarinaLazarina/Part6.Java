package HW2.task2;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ira","tinska",2.2,"middle");
        Worker worker2 = new Worker("Kolya","Yureshev",0.6,"junior");
        Worker worker3 = new Worker("petya","Ivasiv",6.6,"senior");
        Worker worker4 = new Worker("Yulia","Ivasiv",3.6,"senior");

        ArrayList<Worker> workersOfDepartment1 = new ArrayList<>();
        ArrayList<Worker> workersOfDepartment2 = new ArrayList<>();
        ArrayList<Worker> workersOfDepartment3 = new ArrayList<>();

        workersOfDepartment1.add(worker4);
        workersOfDepartment2.add(worker2);
        workersOfDepartment2.add(worker1);
        workersOfDepartment3.add(worker3);

        Department department1 = new Department("Front",workersOfDepartment1);
        Department department2 = new Department("Back",workersOfDepartment2);
        Department department3 = new Department("DevOps", workersOfDepartment3);

        ArrayList<Department> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);
        departments.add(department3);

        Company company1 = new Company("Deckow-Crist", departments);

        System.out.println(company1);
    }
}
