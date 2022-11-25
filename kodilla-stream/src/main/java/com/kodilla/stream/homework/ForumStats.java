package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.util.List;

public class ForumStats {

    public static double getAvgPostsOver40(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public static double getAvgPostsUnder40(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
    }
}


