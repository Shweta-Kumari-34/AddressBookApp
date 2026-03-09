package com.addressbookapp;

import com.addressbookapp.model.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ContactTest {

	@Test
	void givenContactDetails_WhenCreated_ShouldReturnCorrectValues() {
		Contact contact = new Contact("Shweta", "Srivastava", "MP Nagar", "Bhopal", "MP", "462001", "9876543210",
				"shweta@gmail.com");

		assertEquals("Shweta", contact.getFirstName());
		assertEquals("Srivastava", contact.getLastName());
		assertEquals("MP Nagar", contact.getAddress());
		assertEquals("Bhopal", contact.getCity());
		assertEquals("MP", contact.getState());
		assertEquals("462001", contact.getZip());
		assertEquals("9876543210", contact.getPhoneNumber());
		assertEquals("shweta@gmail.com", contact.getEmail());
	}

	@Test
	void givenTwoContactsWithSameFirstAndLastName_WhenCompared_ShouldReturnEqual() {
		Contact contact1 = new Contact("Shweta", "Srivastava", "A", "Bhopal", "MP", "462001", "1111111111",
				"a@gmail.com");
		Contact contact2 = new Contact("Shweta", "Srivastava", "B", "Indore", "MP", "452001", "2222222222",
				"b@gmail.com");

		assertEquals(contact1, contact2);
	}

	@Test
	void givenTwoDifferentContacts_WhenCompared_ShouldReturnNotEqual() {
		Contact contact1 = new Contact("Shweta", "Srivastava", "A", "Bhopal", "MP", "462001", "1111111111",
				"a@gmail.com");
		Contact contact2 = new Contact("Riya", "Kumari", "B", "Patna", "Bihar", "800001", "2222222222", "b@gmail.com");

		assertNotEquals(contact1, contact2);
	}
}