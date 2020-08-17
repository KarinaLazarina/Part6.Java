package HW2.task3;

public class Request {
    private int id;
    private String date;
    private Type type;
    private Client client;

    public Request() {
    }

    public Request(int id, String date, Type type, Client client) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", type=" + type +
                ", client=" + client +
                '}';
    }
}
