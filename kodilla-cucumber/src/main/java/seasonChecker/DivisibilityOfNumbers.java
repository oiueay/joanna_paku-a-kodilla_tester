package seasonChecker;

public class DivisibilityOfNumbers {

    public static String ifNumberIsDivided(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }
        else if (number % 3 == 00 && number % 5 == 0) {
            return "FizzBuzz";
        }
        else {
            return "Nope";
        }
    }
}
