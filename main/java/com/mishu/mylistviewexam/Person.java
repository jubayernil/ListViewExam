package com.mishu.mylistviewexam;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 16-7-16.
 */
public class Person {
    private String name;
    private String phone;

    ArrayList<Person> persons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Person() {
    }

    public ArrayList<Person> getAllPerson(){
        persons = new ArrayList<>();

        persons.add(new Person("Mamun", "123456"));
        persons.add(new Person("Kim", "124545"));
        persons.add(new Person("Rakiblpl", "4577845"));
        persons.add(new Person("Munna", "4545"));

        return persons;
    }
}
