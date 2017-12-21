package com.fredericboisguerin.insa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactsManager {

    private final List<Contact> contactList = new ArrayList<>();
    private static final String EMAIL_REGEX=  "^[a-zA-Z0-9._%+-]+@[a-zA-Z.-]+\\.[a-zA-Z]+$";

    public void addContact(String name, String email, String phoneNumber) throws InvalidContactNameException,InvalidEmailException {
        Contact contact=new Contact(name,email,phoneNumber);
        if(name==null||name.isEmpty()){
            throw new InvalidContactNameException();
        }else{
            if (email !=null && !email.matches(EMAIL_REGEX)){
                throw new InvalidEmailException();
            }
        }
        contactList.add(contact);

    }

    public void printAllContacts() {
        for (Contact index:contactList){
            System.out.println(index);
        }
    }

    public void searchContactByName(String name) {
        List<Contact> matchingContacts = contactList.stream().filter(contact -> contact.nameMatches(name)).collect(Collectors.toList());
          if(matchingContacts.size()>0) {
              for (Contact index : matchingContacts) {
                  System.out.println(index);
              }
          }else{
              System.out.println("No Contact found with name:"+name);
        }

    }
}
