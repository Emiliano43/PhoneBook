package com.company;

import java.util.*;

public class ContactList {
    List<Contact> contacts;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(int index) {
        contacts.remove(index);
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public void changeContact(int index, Contact contact) {
        contacts.set(index, contact);
    }

    public List<Contact> find(String key) {
        List<Contact> notes = new ArrayList<>();
        for(Contact contact: contacts) {
            if (contact.getFirstName().contains(key) || contact.getSecondName().contains(key)){
                notes.add(contact);
                break;
            }

            List<ContactNumber> numberList = contact.getNumbers();
            for (ContactNumber contactNumber : numberList) {
                if (contactNumber.getNumber().contains(key)) {
                    notes.add(contact);
                    break;
                }
            }
        }
        return notes;
    }

    public List<Contact> getContactList() {
        return new ArrayList<>(contacts);
    }
}
