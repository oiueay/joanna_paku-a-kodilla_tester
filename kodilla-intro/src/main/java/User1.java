public class User1 {

    String name;
    int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int sumAges(int[] age) {
        int sum = 0;
        int averageAge = 0;
        for (int i = 0; i < age.length; i++) {
            sum = sum + age[i];
        }

        return sum;
    }
}

