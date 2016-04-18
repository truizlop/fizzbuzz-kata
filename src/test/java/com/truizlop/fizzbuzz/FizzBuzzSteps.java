package com.truizlop.fizzbuzz;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class FizzBuzzSteps {

    @Given("the FizzBuzz program")
    public void theFizzBuzzProgram(){

    }

    @When("the user provides a <number>")
    public void theUserProvidesANumber(@Named("number") int number){

    }

    @Then("the program prints <result>")
    public void theProgramPrints(@Named("result") String result){

    }
}
