package com.bridgelabz;
import java.util.HashSet;
import java.util.*;
public class ContactFunctions {
    Set<ContactItems> contactList = new HashSet<>();

    public void add(ContactItems contactItems) {
        contactList.add(contactItems);
    }

    public void remove(ContactItems contactItems) {
        contactList.remove(contactItems);
    }

    public void display() {
        Iterator iterator = contactList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
