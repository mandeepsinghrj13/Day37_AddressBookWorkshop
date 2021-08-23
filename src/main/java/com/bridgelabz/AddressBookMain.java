package com.bridgelabz;
/**
 * This code takes input name, address, phone number, email and prints address book.
 *
 * @author Mandeep
 */
public class AddressBookMain {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final int zip;
    private final int phoneNumber;
    private final String email;

    public AddressBookMain(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void contactsList( ) {

        System.out.println("firstname: " +firstName);
        System.out.println("lastname: " +lastName);
        System.out.println("address: " +address);
        System.out.println("city: " +city);
        System.out.println("state: " +state);
        System.out.println("zip: " +zip);
        System.out.println("phoneNumber: " +phoneNumber);
        System.out.println("email: " +email);

    }


    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Workshop");
        AddressBookMain contact1 = new AddressBookMain("Baburao", "Aapte", "Star Garage",
                "Mumbai", "Maharashtra", 4569654, 8881212,"baburao@stargarage.com");
        contact1.contactsList();
        System.out.println(contact1);
    }
}