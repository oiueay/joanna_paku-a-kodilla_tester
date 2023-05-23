package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;

import org.junit.Assert;


public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();


    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        Wallet wallet = new Wallet();
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
    }
    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assert.assertEquals(30, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
    }



    @Given("I have deposited $170 in my wallet")
    public void i_have_deposited_$170_in_my_wallet() {
        Wallet wallet = new Wallet();
        wallet.deposit(170);
        Assert.assertEquals(170, wallet.getBalance());
    }
    @When("I request $170")
    public void i_request_$170() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 170);
    }
    @Then("$170 should be dispensed")
    public void $170_should_be_dispensed() {
        Assert.assertEquals(170, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $0")
    public void the_balance_of_my_wallet_should_be_$0() {
        Assert.assertEquals("Incorrect wallet balance", 0,  wallet.getBalance());
    }



    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        Wallet wallet = new Wallet();
        wallet.deposit(0);
        Assert.assertEquals(0, wallet.getBalance());
    }
    @When("I request $170")
    public void i_request_$170() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 1);
    }
    @Then("$170 should be dispensed")
    public void $170_should_be_dispensed() {
        Assert.assertEquals(1, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $0")
    public void the_balance_of_my_wallet_should_be_$0() {
        Assert.assertEquals("Incorrect wallet balance", 0,  wallet.getBalance());
    }
}