package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
    Contact c1;
    ContactService cs = new ContactService();

    @BeforeEach
    void contact_instance(){
                c1 = new Contact(
                "12345",
                "Stephon",
                "Banks",
                "1234567890",
                "123 main street");
    }



    Contact c2 = new Contact
            ("55521",
            "Jane",
            "Doe",
            "0987654321",
            "2323 Non Addy St");




    @Test
    @DisplayName("Adding Contact")
    void add_contact_test() {
        cs.add_contact(c1);
        assertTrue(ContactService.contacts_table.containsKey(c1.getUser_ID()));
    }

    @Test
    @DisplayName("Removing Contact")
    void remove_contact_test() { // The contact has to be added first.
        cs.add_contact(c1);
        cs.remove_contact(c1);
        assertTrue(ContactService.contacts_table.isEmpty());
    }

    @Test
    @DisplayName("Update First Name")
    void update_first_name_test() {
        cs.add_contact(c1);
        cs.update_first_name(c1, c2.getFirst_name());
        assertEquals(c2.getFirst_name(), ContactService.contacts_table.get(c1.getUser_ID()).getFirst_name());
    }

    @Test
    @DisplayName("Update Last Name")
    void update_last_name_test() {
        cs.add_contact(c1);
        cs.update_last_name(c1, c2.getLast_name());
        assertEquals(c2.getLast_name(), ContactService.contacts_table.get(c1.getUser_ID()).getLast_name());
        System.out.println("erm");
    }

    @Test
    @DisplayName("Update Phone Number")
    void update_phone_number_test() {
        cs.add_contact(c1);
        cs.update_phone_number(c1, c2.getPhone_number());
        assertEquals(c2.getPhone_number(), ContactService.contacts_table.get(c1.getUser_ID()).getPhone_number());
    }

    @Test
    @DisplayName("Update Address")
    void update_address_test() { // A bit more complex to check the hashmap
        cs.add_contact(c1);
        cs.update_address(c1,c2.getUser_address());
        assertEquals(c2.getUser_address(), ContactService.contacts_table.get(c1.getUser_ID()).getUser_address());
    }
}