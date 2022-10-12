package Loop.UserAndRandomNumbers.RandomNumbers;

import java.util.Random;

public class RandomNumbers2 {

    private int min = 31;
    private int max = -1;

    public int createNumbers() {
        int sum = 0;
        Random random = new Random();
        while (sum < 5000)
        int number = random.nextInt(31);
        sum += number;
        if (min > number)
            min = number;
        if (max > number)
            max = number;
    }
return sum;
}

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }