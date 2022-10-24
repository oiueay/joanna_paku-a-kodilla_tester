package Loop.Switch.Colour;

import java.util.Scanner;

public class Colour {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select a letter (o- orange, b- black, r- red):");
            String letter = scanner.nextLine().trim();
            switch (letter) {
                case "o":
                    return "orange";
                case "b":
                    return "black";
                case "r":
                    return "red";
                default:
                    System.out.println("Wrong choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        String result = Colour.getUserSelection();
        System.out.println("Result: " + result);
    }
}




