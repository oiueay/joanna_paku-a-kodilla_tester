package com.kodilla.stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class UsersManager2 {

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUserName();
    }


    public static List<User> filteredAges(int age) {
        List<User> usernames = UsersRepository.getUserList()
                .stream()
                .filter(users -> users.getAge() > age)
                .collect(Collectors.toList());

        return usernames;
    }

    public static int filteredAges() {
        int average = UsersRepository.getUserList()
                .stream()
                .mapToInt(User::getAge)
                .min()
                .getAsInt();

        return average;
    }
}


