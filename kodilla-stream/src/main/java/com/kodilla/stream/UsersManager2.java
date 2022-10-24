package com.kodilla.stream;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager2 {

    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }


    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()  // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists")) ////przefiltrowuje listę wybierając tylko chemików
                .map(UsersManager::getUserName) //transformacja (referencja)
                .collect(Collectors.toList());  // kolektor (Collectors.toList() utworzy z elementów przepływających przez strumień listę, którą można przypisać do jakiejś zmiennej, co w powyższym przykładzie dzieje się w linii [1].

        return usernames;
    }


    public static String getUserName(User user) {
        return user.getUserName();
    }
}


