package Loop.UserAndRandomNumbers.User;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();
        User[] users = new User[100];
        for (int n = 0; n < 100; n++) {
            users[n] = new User("User" + n, random.nextInt(40) + 10);
        }

        double averageAge = calculateAverageAge(users);
        for (int n = 0; n < users.length; n++) {
            if (users[n].getAge() > averageAge) {
                System.out.println(users[n].getName());
            }
        }
    }
    private static double calculateAverageAge(User[] users) {
        double sum = 0;
        for (int n = 0; n < users.length; n++) {
            sum += users[n].getAge();
        }
        return sum / users.length;
    }
}

