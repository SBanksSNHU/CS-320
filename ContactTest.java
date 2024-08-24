package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    private Contact c;

    @BeforeEach
    void contact_instance(){
                c = new Contact(
                "12345",
                "Stephon",
                "Banks",
                "1234567890",
                "123 main street");
    }

    @Test
    @DisplayName("Test ID")
    void id_test(){
        assertEquals("12345", c.getUser_ID());
    }

    @Test
    @DisplayName("Test First Name.")
    void first_name_test(){
        assertEquals("Stephon", c.getFirst_name());
    }

    @Test
    @DisplayName("Test Last Name")
    void last_name_test(){
        assertEquals("Banks", c.getLast_name());
    }

    @Test
    @DisplayName("Test Phone Number")
    void phone_number_test(){
        assertEquals("1234567890", c.getPhone_number());
    }

    @Test
    @DisplayName("Test Address")
    void user_address_test(){
        assertEquals("123 main street", c.getUser_address());
    }

}