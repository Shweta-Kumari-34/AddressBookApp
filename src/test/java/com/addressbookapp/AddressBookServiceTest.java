package com.addressbookapp;

import com.addressbookapp.model.Contact;
import com.addressbookapp.service.AddressBookService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
    void givenExistingContact_WhenEdited_ShouldUpdateContactDetails() {
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

        boolean isEdited = addressBookService.editContact(
                "Shweta",
                "Srivastava",
                "Lalghati",
                "Bhopal",
                "Madhya Pradesh",
                "462030",
                "9999999999",
                "newshweta@gmail.com"
        );

        assertTrue(isEdited);
        assertEquals("Lalghati", addressBookService.getAllContacts().get(0).getAddress());
        assertEquals("Bhopal", addressBookService.getAllContacts().get(0).getCity());
        assertEquals("Madhya Pradesh", addressBookService.getAllContacts().get(0).getState());
        assertEquals("462030", addressBookService.getAllContacts().get(0).getZip());
        assertEquals("9999999999", addressBookService.getAllContacts().get(0).getPhoneNumber());
        assertEquals("newshweta@gmail.com", addressBookService.getAllContacts().get(0).getEmail());
    }

    @Test
    void givenNonExistingContact_WhenEdited_ShouldReturnFalse() {
        AddressBookService addressBookService = new AddressBookService();

        boolean isEdited = addressBookService.editContact(
                "Riya",
                "Kumari",
                "Address",
                "Patna",
                "Bihar",
                "800001",
                "8888888888",
                "riya@gmail.com"
        );

        assertFalse(isEdited);
    }

    @Test
    void givenExistingContact_WhenDeleted_ShouldRemoveContact() {
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

        boolean isDeleted = addressBookService.deleteContact("Shweta", "Srivastava");

        assertTrue(isDeleted);
        assertEquals(0, addressBookService.getAllContacts().size());
    }

    @Test
    void givenNonExistingContact_WhenDeleted_ShouldReturnFalse() {
        AddressBookService addressBookService = new AddressBookService();

        boolean isDeleted = addressBookService.deleteContact("Riya", "Kumari");

        assertFalse(isDeleted);
    }
}