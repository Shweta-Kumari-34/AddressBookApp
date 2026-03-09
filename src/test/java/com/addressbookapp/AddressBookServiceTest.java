package com.addressbookapp;

import com.addressbookapp.model.Contact;
import com.addressbookapp.service.AddressBookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressBookServiceTest {

    @Test
    void givenNewContact_WhenAdded_ShouldIncreaseContactListSize() {
        AddressBookService addressBookService = new AddressBookService();

        Contact contact = new Contact(
                "Shweta",
                "Srivastava",
                "MP Nagar",
                "Bhopal",
                "MP",
                "462001",
                "9876543210",
                "shweta@gmail.com"
        );

        addressBookService.addContact(contact);

        assertEquals(1, addressBookService.getAllContacts().size());
    }

    @Test
    void givenMultipleContacts_WhenAdded_ShouldStoreAllContacts() {
        AddressBookService addressBookService = new AddressBookService();

        Contact contact1 = new Contact("Shweta", "Srivastava", "A", "Bhopal", "MP", "462001", "1111111111", "a@gmail.com");
        Contact contact2 = new Contact("Riya", "Kumari", "B", "Patna", "Bihar", "800001", "2222222222", "b@gmail.com");

        addressBookService.addContact(contact1);
        addressBookService.addContact(contact2);

        assertEquals(2, addressBookService.getAllContacts().size());
    }
}