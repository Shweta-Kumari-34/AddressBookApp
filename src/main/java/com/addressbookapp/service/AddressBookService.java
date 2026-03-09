package com.addressbookapp.service;

import com.addressbookapp.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class AddressBookService {

    private final List<Contact> contactList;

    public AddressBookService() {
        this.contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        if (contactList.isEmpty()) {
            System.out.println("Address Book is empty.");
            return;
        }

        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    public List<Contact> getAllContacts() {
        return contactList;
    }

    public boolean editContact(String firstName, String lastName,
                               String address, String city, String state,
                               String zip, String phoneNumber, String email) {

        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)
                    && contact.getLastName().equalsIgnoreCase(lastName)) {

                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);

                System.out.println("Contact updated successfully.");
                return true;
            }
        }

        System.out.println("Contact not found.");
        return false;
    }
}