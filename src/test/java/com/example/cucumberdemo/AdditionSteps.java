package com.example.cucumberdemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AdditionSteps {
    private int num1;
    private int num2;
    private int result;

    @Given("I have numbers {int} and {int}")
    public void i_have_numbers(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    @When("I add them")
    public void i_add_them() {
        result = num1 + num2;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expected) {
        Assert.assertEquals(expected, result);
    }
}
