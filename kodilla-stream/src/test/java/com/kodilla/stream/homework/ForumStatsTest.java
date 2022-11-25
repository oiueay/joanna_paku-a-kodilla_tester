package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ForumStatsTest {

    private List<User> allUsers() {
        return List.of(
                new User("Walter White", 50, 7, "Chemists"),
                new User("Jessie Pinkman", 25, 4648, "Sales"),
                new User("Tuco Salamanca", 34, 116, "Manager"),
                new User("Gus Firing", 49, 0, "Board"),
                new User("Gale Boetticher", 44, 2, "Chemists"),
                new User("Mike Ehrmantraut", 57, 0, "Security")
        );
    }

    @Test
    void shouldCalcOver40() {
        double result = ForumStats.getAvgPostsOver40(allUsers());
        Assertions.assertEquals(2.25, result);
    }

    @Test
    void shouldCalcUnder40() {
        double result = ForumStats.getAvgPostsUnder40(allUsers());
        Assertions.assertEquals(2382, result);
    }
}