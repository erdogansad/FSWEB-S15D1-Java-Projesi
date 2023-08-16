package Workintech.Phone;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("1231231");
        Contact ahmet = new Contact("Ahmet", "1231231");
        phone.addNewContact(new Contact("Ayse", "5464665"));
        phone.addNewContact(ahmet);
        phone.addNewContact(new Contact("Cem", "1231232"));
        phone.addNewContact(new Contact("Ali", "1231232"));
        phone.addNewContact(new Contact("Cem", "1231233"));
        phone.printContact();

        System.out.println("Index: " + phone.findContact(ahmet));
        System.out.println("Index with String: " + phone.findContact(ahmet.getName()));
        System.out.println("Query Contact: " + phone.queryContact("Ayse"));
        phone.removeContact(ahmet);
        phone.printContact();

        List<String> fruits = new LinkedList<>();
        fruits.add("Banana".toLowerCase());
        fruits.add("Apple".toLowerCase());
    }

}
