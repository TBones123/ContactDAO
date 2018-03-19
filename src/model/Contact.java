package model;

import java.util.Objects;

public class Contact {
    private int id;
    private String name;
    private String surName;
    public Company company;
    private String email;
    private String phone;
    Departament departament;

    public Contact(int id, String name, String surname, Company company, String email, String phone, Departament departament) {
        this.id = id;
        this.name = name;
        this.surName = surname;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.departament = departament;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "\n"+"Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", company=" + company +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", departament=" + departament +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id &&
                Objects.equals(name, contact.name) &&
                Objects.equals(surName, contact.surName) &&
                company == contact.company &&
                Objects.equals(email, contact.email) &&
                Objects.equals(phone, contact.phone) &&
                departament == contact.departament;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surName, company, email, phone, departament);
    }
}
