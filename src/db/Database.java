package db;

import model.Contact;

import java.util.LinkedList;
import java.util.List;

public class Database {
    List<Contact> contactList = new LinkedList<>();

    public List<Contact> getContactList() {
        return contactList;
    }

}
