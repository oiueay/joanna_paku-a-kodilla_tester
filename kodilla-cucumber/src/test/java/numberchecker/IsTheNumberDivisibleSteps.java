package seasonchecker;
import io.cucumber.java8.En;
import org.junit.Assert;
import seasonChecker.DivisibilityOfNumbers;
import seasonChecker.SeasonChecker;

public class IsTheNumberDivisibleSteps implements En {
    private int number;
    private String answer;

    public IsTheNumberDivisibleSteps() {
        Given("a number which is equal to {int}", (Integer int1) -> {
            this.number = int1;
        });
        When("I call {string} algorithm", () -> {
            DivisibilityOfNumbers divisibilityOfNumbers = new DivisibilityOfNumbers();
            this.answer = divisibilityOfNumbers.ifNumberIsDivided(this.number);
        });
        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}