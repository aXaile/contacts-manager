package com.fredericboisguerin.insa;

import java.util.ArrayList;
import java.util.List;

public class ContactsManager {

    private List<Contact> contactList = new ArrayList<>();

    public void addContact(String name, String email, String phoneNumber) {
        Contact contact=new Contact(name,email,phoneNumber);
        contactList.add(contact);

    }

    public void printAllContacts() {

    }

    public void searchContactByName(String name) {

    }
}
