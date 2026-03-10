package com.addressbookapp;

import com.addressbookapp.model.Contact;
import com.addressbookapp.service.AddressBookService;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddressBookService addressBookService = new AddressBookService();
        boolean isRunning = true;

        System.out.println("Welcome to Address Book Application");

        while (isRunning) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    boolean addMore = true;

                    while (addMore) {
                        System.out.print("Enter First Name: ");
                        String firstName = scanner.nextLine();

                        System.out.print("Enter Last Name: ");
                        String lastName = scanner.nextLine();

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

                        Contact contact = new Contact(
                                firstName,
                                lastName,
                                address,
                                city,
                                state,
                                zip,
                                phoneNumber,
                                email
                        );

                        addressBookService.addContact(contact);

                        System.out.print("Do you want to add another contact? (yes/no): ");
                        String response = scanner.nextLine();

                        if (!response.equalsIgnoreCase("yes")) {
                            addMore = false;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nContact List:");
                    addressBookService.displayContacts();
                    break;

                case 3:
                    System.out.print("Enter First Name of contact to edit: ");
                    String editFirstName = scanner.nextLine();

                    System.out.print("Enter Last Name of contact to edit: ");
                    String editLastName = scanner.nextLine();

                    System.out.print("Enter New Address: ");
                    String newAddress = scanner.nextLine();

                    System.out.print("Enter New City: ");
                    String newCity = scanner.nextLine();

                    System.out.print("Enter New State: ");
                    String newState = scanner.nextLine();

                    System.out.print("Enter New Zip: ");
                    String newZip = scanner.nextLine();

                    System.out.print("Enter New Phone Number: ");
                    String newPhoneNumber = scanner.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();

                    addressBookService.editContact(
                            editFirstName,
                            editLastName,
                            newAddress,
                            newCity,
                            newState,
                            newZip,
                            newPhoneNumber,
                            newEmail
                    );
                    break;

                case 4:
                    System.out.print("Enter First Name of contact to delete: ");
                    String deleteFirstName = scanner.nextLine();

                    System.out.print("Enter Last Name of contact to delete: ");
                    String deleteLastName = scanner.nextLine();

                    addressBookService.deleteContact(deleteFirstName, deleteLastName);
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Exiting Address Book Application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}