package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ForumStatsTest {

    private List<User> allUsers() {
        return List.of(
                new User("A", 41, 10, "Z"),
                new User("A", 60, 11, "Z"),
                new User("A", 90, 12, "Z"),
                new User("A", 38, 13, "Z"),
                new User("A", 23, 14, "Z"),
                new User("A", 15, 15, "Z")
        );
    }

    @Test
    void shouldCalcOver40() {
        double result = ForumStats.getAvgPostsOver40(allUsers());
        Assertions.assertEquals(11, result);
    }

    @Test
    void shouldCalcUnder40() {
        double result = ForumStats.getAvgPostsUnder40(allUsers());
        Assertions.assertEquals(14, result);
    }
}