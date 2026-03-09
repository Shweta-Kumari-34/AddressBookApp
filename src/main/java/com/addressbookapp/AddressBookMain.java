package com.addressbookapp;

import com.addressbookapp.model.Contact;
import com.addressbookapp.service.AddressBookService;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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

        System.out.println("\nExisting Contacts:");
        addressBookService.displayContacts();

        System.out.println("\nEnter contact name to edit");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("\nEnter new details");

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        addressBookService.editContact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        System.out.println("\nUpdated Contacts:");
        addressBookService.displayContacts();

        scanner.close();
    }
}