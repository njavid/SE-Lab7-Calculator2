package calculator;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private String opt="";
    private int value1;
    private int value2;
    private int result;
    @Before
    public void before() {
        calculator = new Calculator();
    }
    @Given("^Three input values, (\\d+) and (\\d+) and \"([^\"]*)\"$")
    public void threeInputValuesAndAnd(int arg0, int arg1, String arg2) throws Throwable {
        opt = arg2;
        value1 = arg0;
        value2 = arg1;
        throw new PendingException();
    }
    @When("^I operate the two values$")
    public void iOperateTheTwoValues() {
        if ("^".equals(opt)) {
            result = calculator.pow(value1, value2);
        } else if ("\\".equals(opt)) {
            result = calculator.divide(value1, value2);
        }
    }
    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
