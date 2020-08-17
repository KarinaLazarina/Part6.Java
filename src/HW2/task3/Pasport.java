package HW2.task3;

public class Pasport {
    private String seriya;
    private long number;
    private String vydan;

    public Pasport(String seriya, long number, String vydan) {
        this.seriya = seriya;
        this.number = number;
        this.vydan = vydan;
    }

    public Pasport() {
    }

    @Override
    public String toString() {
        return "Pasport{" +
                "seriya='" + seriya + '\'' +
                ", number=" + number +
                ", vydan='" + vydan + '\'' +
                '}';
    }

    public String getSeriya() {
        return seriya;
    }

    public void setSeriya(String seriya) {
        this.seriya = seriya;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getVydan() {
        return vydan;
    }

    public void setVydan(String vydan) {
        this.vydan = vydan;
    }
}
