package com.addressbookapp;

import org.junit.jupiter.api.Test;

import com.addressbookapp.model.Contact;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void shouldCreateContactUsingDefaultConstructorAndSetters() {
        Contact contact = new Contact();

        contact.setFirstName("Shweta");
        contact.setLastName("Srivastava");
        contact.setAddress("MP Nagar");
        contact.setCity("Bhopal");
        contact.setState("Madhya Pradesh");
        contact.setZip("462001");
        contact.setPhoneNumber("9876543210");
        contact.setEmail("shweta@gmail.com");

        assertEquals("Shweta", contact.getFirstName());
        assertEquals("Srivastava", contact.getLastName());
        assertEquals("MP Nagar", contact.getAddress());
        assertEquals("Bhopal", contact.getCity());
        assertEquals("Madhya Pradesh", contact.getState());
        assertEquals("462001", contact.getZip());
        assertEquals("9876543210", contact.getPhoneNumber());
        assertEquals("shweta@gmail.com", contact.getEmail());
    }

    @Test
    void shouldCreateContactUsingParameterizedConstructor() {
        Contact contact = new Contact(
                "Shweta",
                "Srivastava",
                "MP Nagar",
                "Bhopal",
                "Madhya Pradesh",
                "462001",
                "9876543210",
                "shweta@gmail.com"
        );

        assertEquals("Shweta", contact.getFirstName());
        assertEquals("Srivastava", contact.getLastName());
        assertEquals("MP Nagar", contact.getAddress());
        assertEquals("Bhopal", contact.getCity());
        assertEquals("Madhya Pradesh", contact.getState());
        assertEquals("462001", contact.getZip());
        assertEquals("9876543210", contact.getPhoneNumber());
        assertEquals("shweta@gmail.com", contact.getEmail());
    }

    @Test
    void shouldReturnTrueForEqualContacts() {
        Contact contact1 = new Contact(
                "Shweta", "Srivastava", "MP Nagar", "Bhopal",
                "Madhya Pradesh", "462001", "9876543210", "shweta@gmail.com"
        );

        Contact contact2 = new Contact(
                "Shweta", "Srivastava", "Lalghati", "Bhopal",
                "Madhya Pradesh", "462030", "9999999999", "abc@gmail.com"
        );

        assertEquals(contact1, contact2);
    }

    @Test
    void shouldReturnFalseForDifferentContacts() {
        Contact contact1 = new Contact(
                "Shweta", "Srivastava", "MP Nagar", "Bhopal",
                "Madhya Pradesh", "462001", "9876543210", "shweta@gmail.com"
        );

        Contact contact2 = new Contact(
                "Riya", "Kumari", "Lalghati", "Patna",
                "Bihar", "800001", "9999999999", "riya@gmail.com"
        );

        assertNotEquals(contact1, contact2);
    }

    @Test
    void shouldReturnSameHashCodeForEqualContacts() {
        Contact contact1 = new Contact(
                "Shweta", "Srivastava", "MP Nagar", "Bhopal",
                "Madhya Pradesh", "462001", "9876543210", "shweta@gmail.com"
        );

        Contact contact2 = new Contact(
                "Shweta", "Srivastava", "Another Address", "Indore",
                "Madhya Pradesh", "452001", "8888888888", "test@gmail.com"
        );

        assertEquals(contact1.hashCode(), contact2.hashCode());
    }

    @Test
    void shouldContainFieldValuesInToString() {
        Contact contact = new Contact(
                "Shweta",
                "Srivastava",
                "MP Nagar",
                "Bhopal",
                "Madhya Pradesh",
                "462001",
                "9876543210",
                "shweta@gmail.com"
        );

        String result = contact.toString();

        assertTrue(result.contains("Shweta"));
        assertTrue(result.contains("Srivastava"));
        assertTrue(result.contains("MP Nagar"));
        assertTrue(result.contains("Bhopal"));
        assertTrue(result.contains("Madhya Pradesh"));
        assertTrue(result.contains("462001"));
        assertTrue(result.contains("9876543210"));
        assertTrue(result.contains("shweta@gmail.com"));
    }
}