import dao.ContactDAO;
import model.Company;
import model.Contact;
import model.Departament;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static model.Company.Apple;
import static model.Company.Intel;
import static model.Company.Microsoft;
import static model.Departament.Factory;
import static model.Departament.Support;
import static model.Departament.Tech;


public class Main {
    public static void main(String[] args) {
        ContactDAO contactDAO = new ContactDAO();
        contactDAO.save(new Contact(
                1,
                "Andrey",
                "Radushev",
                Apple,
                "radushev123@gmail.com",
                "999-565",
                Factory));
        contactDAO.save(new Contact(
                1,
                "Andrey",
                "Radushev",
                Apple,
                "radushev123@gmail.com",
                "999-565",
                Factory));
        contactDAO.save(new Contact(
                2,
                "Vasya",
                "Kok",
                Intel,
                "vasya123@gmail.com",
                "929-565",
                Tech));
        contactDAO.save(new Contact(
                3,
                "Petya",
                "MOk",
                Microsoft,
                "petya123@gmail.com",
                "999-565",
                Support));
        contactDAO.save(new Contact(
                4,
                "Dasha",
                "Pop",
                Apple,
                "dasha123@gmail.com",
                "996-565",
                Factory));
        contactDAO.save(new Contact(
                5,
                "Masha",
                "Sos",
                Intel,
                "masha123@gmail.com",
                "949-565",
                Tech));
        List<Contact> contactsALL = contactDAO.findALL();
        Stream<Contact> stream = contactsALL.stream();
        List<Contact> collect = stream
                .distinct()
                .filter(contact -> contact.company.equals(Microsoft))
//                .sorted(Comparator.comparing(Contact::getEmail))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

}
