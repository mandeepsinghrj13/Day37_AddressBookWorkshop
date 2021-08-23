package com.bridgelabz;
/**
 * This code takes input name, address, phone number, email and prints address book.
 * also includes feature to edit and delete contact.
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

        System.out.println("Welcome to AddressBook Workshop");//welcome message

        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContactList();
    }


    public void addContactList() {
        while (true) {
            System.out.println("Press 0 - Display all contacts");
            System.out.println("Press 1 - Add contact");
            System.out.println("Press 2 - Edit contact");
            System.out.println("Press 3 - Delete contact");
            System.out.println("Press 6 - Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0 : contactFunctions.display(contactList);
                case 1 : contactFunctions.addContact(contactList);
                case 2 : contactFunctions.editContact(contactList);
                case 3 : contactFunctions.deleteContact(contactList);
            }
            if (option == 6) {
                break;
            }
        }
    }
}



