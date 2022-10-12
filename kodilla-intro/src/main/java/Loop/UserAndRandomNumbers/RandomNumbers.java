package UserAndRandomNumbers;

public class RandomNumbers {

     public static int getCountOfNumber(int max) {
        RandomNumbers2 random = new RandomNumbers2();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
          return result;
    }
}

