package Loop.UserAndRandomNumbers.RandomNumbers;

public class App {

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        System.out.println(randomNumbers.createNumbers());
        System.out.println(randomNumbers.getMin());
        System.out.println(randomNumbers.getMax());
    }
}

