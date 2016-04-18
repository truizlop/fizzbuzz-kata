package com.truizlop.fizzbuzz;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzSteps {

    private FizzBuzz fizzBuzz;
    private String expected;

    @Given("the FizzBuzz program")
    public void theFizzBuzzProgram(){
        fizzBuzz = new FizzBuzz();
    }

    @When("the user provides a <number>")
    public void theUserProvidesANumber(@Named("number") int number){
        expected = fizzBuzz.run(number);
    }

    @Then("the program prints <result>")
    public void theProgramPrints(@Named("result") String result){
        assertThat(expected, is(equalTo(result)));
    }
}
