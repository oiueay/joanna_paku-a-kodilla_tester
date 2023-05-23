package com.kodilla.stream;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();
    }

    public static String getUserName(User user) {
        return user.getUserName();
    }

    private static void processUsersStream() {
        UsersRepository.getUserList()
                .stream()
                .map(user -> user.getUserName()) //transformacja (wyrażenie lambda)
                .forEach(username -> System.out.println(username)); //kolektor
    }
}

