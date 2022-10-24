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


//     w klasie UsersManager stwórz metodę statyczną wykorzystującą Stream,
//        która będzie zwracała kolekcję elementów typu User. Metoda ma przyjmować argument typu int
//        i zwrócić użytkowników starszych od podanej liczby w argumencie metody. Napisz testy sprawdzające czy wszystkie
//        zwrócone elementy posiadają wiek większy od podanej wartości.