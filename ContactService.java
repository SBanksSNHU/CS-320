package org.example;

import java.util.Hashtable;


    // Add contacts with unique ID
    // Delete contacts per contact ID
    // Should be able to update fields per contact ID
    // Suitable data structure, hash map
public class ContactService {
    static Hashtable<String, Contact> contacts_table = new Hashtable<String, Contact>();
    static String current_User;


    void add_contact(Contact c){
        Contact key = contacts_table.get(c.getUser_ID());
        if(key != null){
        System.out.println("Contact Already Exists!");
        }
        else{
            contacts_table.put(c.getUser_ID(), c);
            System.out.println("Contact Added!");

        }

    }

    void remove_contact(Contact c){
        Contact key = contacts_table.get(c.getUser_ID());
        if(key == null){
            System.out.println("Contact Does Not Exist!");
        }
        else{
            contacts_table.remove(c.getUser_ID());
        }

    }

    void update_first_name(Contact c, String value){
        Contact key = contacts_table.get(c.getUser_ID());
        if(key == null){
            System.out.println("Contact Does Not Exist!");
        }
        else{
            key.setFirst_name(value);
        }
    }

    void update_last_name(Contact c, String value){
        Contact key = contacts_table.get(c.getUser_ID());
        if(key == null){
            System.out.println("Contact Does Not Exist!");
        }
        else{
            key.setLast_name(value);
        }
    }

    void update_phone_number(Contact c, String value){
        Contact key = contacts_table.get(c.getUser_ID());
        if(key == null){
            System.out.println("Contact Does Not Exist!");
        }
        else{
            key.setPhone_number(value);
        }
    }

    void update_address(Contact c, String value){
        Contact key = contacts_table.get(c.getUser_ID());
        if(key == null){
            System.out.println("Contact Does Not Exist!");
        }
        else{
            key.setUser_address(value);
            System.out.println("Address Updated.");
        }
    }

}
