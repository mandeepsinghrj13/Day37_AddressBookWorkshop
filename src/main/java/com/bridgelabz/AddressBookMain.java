package com.bridgelabz;
/**
 * This code takes input name, address, phone number, email and prints address book.
 *
 * @author Mandeep
 */
import java.util.Scanner;
import java.util.ArrayList;
public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static ContactFunctions contactFunctions = new ContactFunctions();
    static ArrayList<ContactItems> contactList = new ArrayList<>();
    //main method
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

        contactFunctions.add(contactItems, contactList);

    }
    public void editContact() {

        System.out.println("Enter the first name of contact you wish to edit");
        String edit = sc.nextLine();
        System.out.println("Press 1 - To edit first name");
        System.out.println("Press 2 - To edit last name");
        System.out.println("Press 3 - To edit address");
        System.out.println("Press 4 - To edit city");
        System.out.println("Press 5 - To edit state");
        System.out.println("Press 6 - To edit zip code");
        System.out.println("Press 7 - To edit phone number");
        System.out.println("Press 8 - To edit email");
        int choice = sc.nextInt();
        if (choice == 1) {
            for (ContactItems contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new first name");
                    contactItems.firstName = sc.nextLine();
                }
            }
        }
        if (choice == 2) {
            for (ContactItems contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new last name");
                    contactItems.lastName = sc.nextLine();
                }
            }
        }
        if (choice == 3) {
            for (ContactItems contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new address");
                    contactItems.address = sc.nextLine();
                }
            }
        }
        if (choice == 4) {
            for (ContactItems contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new city");
                    contactItems.city = sc.next();
                }
            }
        }
        if (choice == 5) {
            for (ContactItems contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new state");
                    contactItems.state = sc.next();
                }
            }
        }
        if (choice == 6) {
            for (ContactItems contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new zip code");
                    contactItems.zip = sc.nextInt();
                }
            }
        }
        if (choice == 7) {
            for (ContactItems contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new phone number");
                    contactItems.phoneNumber = sc.nextLong();
                }
            }
        }
        if (choice == 8) {
            for (ContactItems contactItems : contactList) {
                if (contactItems.firstName.equals(edit)) {
                    System.out.println("Enter new email");
                    contactItems.email = sc.next();
                }
            }
        }
    }
    public void addContactList() {
        while (true) {
            System.out.println("Press 0 - Display all contacts");
            System.out.println("Press 1 - Add contact");
            System.out.println("Press 2 - Edit contact");
            System.out.println("Press 6 - Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0 : contactFunctions.display(contactList);
                case 1 : addContact();
                case 2 : editContact();
            }
            if (option == 6) {
                break;
            }
        }
    }
}



