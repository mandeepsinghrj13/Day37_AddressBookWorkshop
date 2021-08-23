package com.bridgelabz;
/**
 * This code takes input name, address, phone number, email and prints address book.
 *
 * @author Mandeep
 */
import java.util.Scanner;
public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static ContactFunctions contactFunctions = new ContactFunctions();
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Workshop");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContactList();
    }
    public void addContact() {

        ContactItems contactItems = new ContactItems();

        System.out.println("Enter first name : ");
        contactItems.firstName = sc.next();

        System.out.println("Enter last name : ");
        contactItems.lastName = sc.next();

        System.out.println("Enter address : ");
        contactItems.address = sc.next();
        sc.next();

        System.out.println("Enter city : ");
        contactItems.city = sc.next();

        System.out.println("Enter state : ");
        contactItems.state = sc.next();

        System.out.println("Enter zip code : ");
        contactItems.zip = sc.nextInt();

        System.out.println("Enter phone number : ");
        contactItems.phoneNumber = sc.nextInt();

        System.out.println("Enter email : ");
        contactItems.email = sc.next();

        contactFunctions.add(contactItems);

    }

    public void addContactList() {
        while (true) {
            System.out.println("Press 0 - Display all contacts");
            System.out.println("Press 1 - Add contact");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0:
                    contactFunctions.display();
                    break;
                case 1:
                    addContact();
                    break;
            }
            if (option == 3) { break; }
        }
    }



}