package com.addressbookapp.service;
import com.addressbookapp.model.Contact;
import java.util.ArrayList;
import java.util.List;

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
}