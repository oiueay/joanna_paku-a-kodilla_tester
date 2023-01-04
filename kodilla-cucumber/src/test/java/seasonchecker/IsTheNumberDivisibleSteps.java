package seasonchecker;
import io.cucumber.java8.En;
import org.junit.Assert;
import seasonChecker.DivisibilityOfNumbers;

public class IsTheNumberDivisibleSteps implements En {
    private int number;
    private String answer;
    private String dividedBy;

    public IsTheNumberDivisibleSteps() {
        Given("a number which is equal to {int}", (Integer int1) -> {
            this.number = int1;
        });
        When("I call {string} algorithm", (String answer) -> {
            this.answer = "Fizz";
        });
        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}