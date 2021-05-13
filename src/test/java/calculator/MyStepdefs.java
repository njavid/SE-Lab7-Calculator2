package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @When("^I operate the two values$")
    public void iOperateTheTwoValues() {
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
    }

    @Given("^two input values, (\\d+), (\\d+) and an opt '\\^'$")
    public void twoInputValuesAndAnOpt(int arg0, int arg1) {
    }
}
