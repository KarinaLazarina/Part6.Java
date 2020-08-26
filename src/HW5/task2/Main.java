package HW5.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Contact> list = new LinkedList<>();
        list.add(new Contact(1,"Olya",Company.Apple,"tyrih","@gmail.com","77777",Department.TECH));
        list.add(new Contact(1,"Olya",Company.Apple,"tyrih","@gmail.com","77777",Department.TECH));
        list.add(new Contact(2,"Petya",Company.Intel,"Yuriv","@gmail.com","77777",Department.FACTORY));
        list.add(new Contact(3,"Katya",Company.Microsoft,"Rimach","@gmail.com","77777",Department.SUPPORT));
        list.add(new Contact(4,"Nastya",Company.Apple,"Dimar","@gmail.com","77777",Department.SUPPORT));
        list.add(new Contact(5,"Nastya",Company.Intel,"tyrih","@gmail.com","77777",Department.TECH));
        list.add(new Contact(6,"Vasya",Company.Microsoft,"Pukin","@gmail.com","77777",Department.FACTORY));
        list.add(new Contact(7,"Yulia",Company.Microsoft,"Knazyv","@gmail.com","77777",Department.TECH));
        list.add(new Contact(8,"Ira",Company.Intel,"Dimarych","@gmail.com","77777",Department.FACTORY));
        list.add(new Contact(9,"Yura",Company.Apple,"Skalikov","@gmail.com","77777",Department.TECH));

        //-занести їх в базу
        DAO contacts = new DAO(list);

        //-знайти всі унікальні контакти
        List<Contact> collect = contacts.getContacts().stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("------------------");

        //  -знайти всі унікальні контакти з певного департаменту.
        List<Contact> collect1 = contacts.getContacts().stream()
                .filter(contact -> contact.getDepartment() == Department.TECH)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("------------------");
        //  -знайти всі унікальні контакти з певного департаменту
        //  посортувавши їх по імейлу .
        List<Contact> collect2 = contacts.getContacts().stream()
                .filter(contact -> contact.getDepartment() == Department.TECH)
                .distinct()
                .sorted((a,b)-> a.getName().compareTo(b.getName()))
                .collect(Collectors.toList());
        System.out.println(collect2);
        System.out.println("------------------");
        //
        //  -знайти всі унікальні контакти згрупувавши їх по компанії !!!!
        List<Contact> collect3 = contacts.getContacts().stream()
                .filter(contact -> contact.getDepartment() == Department.TECH)
                .distinct()
                .collect(Collectors.toList());
        List<Contact> collect4 = contacts.getContacts().stream()
                .filter(contact -> contact.getDepartment() == Department.FACTORY)
                .distinct()
                .collect(Collectors.toList());
        List<Contact> collect5 = contacts.getContacts().stream()
                .filter(contact -> contact.getDepartment() == Department.SUPPORT)
                .distinct()
                .collect(Collectors.toList());

        collect3.addAll(collect4);
        collect3.addAll(collect5);

        System.out.println(collect3);

    }
}
