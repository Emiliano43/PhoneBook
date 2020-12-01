package com.company;

public class Main {

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        Contact contact1 = new Contact("Ivan", "Frolov");
        contact1.addNumber(new ContactNumber(NumberType.Working, "79998887766"));
        contact1.addNumber(new ContactNumber(NumberType.Home, "88126660000"));

        Contact contact2 = new Contact("Mihail", "Ivanov");
        contact2.addNumber(new ContactNumber(NumberType.Mobile, "79918817166"));
        contact2.addNumber(new ContactNumber(NumberType.Working, "88121661000"));

        contactList.addContact(contact1);
        contactList.addContact(contact2);

        for (Contact contact : contactList.getContactList()) {
            System.out.println(contact);
        }

        for (Contact contact : contactList.find("F")) {
            System.out.println(contact);
        }

        for (Contact contact : contactList.find("812")) {
            System.out.println(contact);
        }

        contact2.addNumber(new ContactNumber(NumberType.Home, "657843213546"));

        for (Contact contact : contactList.getContactList()) {
            System.out.println(contact);
        }
    }
}
