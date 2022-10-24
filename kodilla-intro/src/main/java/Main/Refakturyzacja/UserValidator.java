package Main.Refakturyzacja;

public class UserValidator {

    String name;
    double age;
    double height;

    void validateName(String name) {
        if (name != null) {
        }
    }

    void validateAgeAndHeight(double age, double height) {
        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}
