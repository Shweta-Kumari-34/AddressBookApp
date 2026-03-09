package com.addressbookapp;

import com.addressbookapp.model.Contact;
import com.addressbookapp.service.AddressBookService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AddressBookServiceTest {

    @Test
    void givenExistingContact_WhenEdited_ShouldUpdateContactDetails() {

        AddressBookService addressBookService = new AddressBookService();

        Contact contact = new Contact(
                "Alice",
                "Srivastava",
                "MP Nagar",
                "Bhopal",
                "MP",
                "462001",
                "9876543210",
                "shweta@gmail.com"
        );

        addressBookService.addContact(contact);

        boolean isEdited = addressBookService.editContact(
                "Alice",
                "Srivastava",
                "Lalghati",
                "Bhopal",
                "Madhya Pradesh",
                "462030",
                "9999999999",
                "newalice@gmail.com"
        );

        assertTrue(isEdited);
        assertEquals("Lalghati", addressBookService.getAllContacts().get(0).getAddress());
        assertEquals("462030", addressBookService.getAllContacts().get(0).getZip());
        assertEquals("9999999999", addressBookService.getAllContacts().get(0).getPhoneNumber());
        assertEquals("newalice@gmail.com", addressBookService.getAllContacts().get(0).getEmail());
    }
}