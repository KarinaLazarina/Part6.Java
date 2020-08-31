package HW5.task2;

import java.util.LinkedList;
import java.util.List;

public class DAO {
    private List<Contact> contacts = new LinkedList<>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public DAO(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void read(){
        System.out.println(contacts);
    }

    public void update(int index ,Contact contact){ this.contacts.set(index,contact); }

    public void delete(){
        this.contacts.clear();
    }

    public void create(Contact contact){ this.contacts.add(contact); }


}
