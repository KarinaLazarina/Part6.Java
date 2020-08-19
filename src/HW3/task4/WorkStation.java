package HW3.task4;

public class WorkStation extends Computer {
    private String nameOfUser;

    public WorkStation(int id, String nameOfUser) {
        super(id);
        this.nameOfUser = nameOfUser;
    }

    public WorkStation() {
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }
}
