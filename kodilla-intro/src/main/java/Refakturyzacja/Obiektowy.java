package Refakturyzacja;

public class Obiektowy {
    String name;
    double age;
    double height;

    Obiektowy(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkPerson() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main(String[] args) {
        Obiektowy person = new Obiektowy("Adam", 40.5, 178);
        System.out.println(person.name + person.age + person.height);
        person.checkPerson();
    }
}
