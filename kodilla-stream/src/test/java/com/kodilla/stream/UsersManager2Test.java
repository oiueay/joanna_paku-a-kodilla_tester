package com.kodilla.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManager2Test {

    @Test
    void shouldReturnFilteredUsers() {
        List<String> expected = List.of("Walter White", "Gale Boetticher");

        List<String> result = UsersManager2.filterChemistGroupUsernames();

        assertEquals(expected, result);
    }


    @Test
    void shouldReturnOlderUsers() {

        List<User> result = UsersManager2.filteredAges(10);

        Assertions.assertEquals(6, result.size());
    }

    @Test
    void shouldReturnTheYoungestUser() {
        int expected = 25;
        int result = UsersManager2.filteredAges();
        assertEquals(expected, result);
    }
}