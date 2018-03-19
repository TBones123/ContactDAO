package dao;

import db.Database;
import model.Contact;

import java.util.Iterator;
import java.util.List;

public class ContactDAO {


    private Database database = new Database();

    public void save(Contact contact){

        database.getContactList().add(contact);
    }
    
    public void delete (int id){

        List<Contact> contactList = database.getContactList();
        Iterator<Contact> iterator = contactList.iterator();
        while (iterator.hasNext()) {
            Contact next = iterator.next();
            if (next.getId() == id){
                iterator.remove();
            }
        }
    }
    public Contact findOne (int id){
        Contact contact = null;
        Iterator<Contact> iterator = database.getContactList().iterator();
        while (iterator.hasNext()) {
            Contact next = iterator.next();
            if (next.getId() == id) contact = next;
        }
        return contact;
    }
    public List<Contact> findALL(){
        return database.getContactList();
    }


}
