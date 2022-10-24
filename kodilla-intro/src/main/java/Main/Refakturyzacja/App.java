package Main.Refakturyzacja;

public class App {
    public static void main(String[] args) {
        UserValidator person = new UserValidator();
        person.validateName("Adam");
        person.validateAgeAndHeight(40.5, 178);
    }
}

