package com.truizlop.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {

    private static final int NOT_MULTIPLE_OF_THREE_OR_FIVE = 2;
    private static final String NOT_MULTIPLE_OF_THREE_OR_FIVE_STRING = "2";
    private static final int MULTIPLE_OF_THREE = 9;
    private static final int MULTIPLE_OF_FIVE = 20;
    private static final int MULTIPLE_OF_THREE_AND_FIVE = 45;

    private FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnTheSameInputForNumbersThatAreNotMultiplesOfThreeOrFive(){
        assertThat(fizzBuzz.run(NOT_MULTIPLE_OF_THREE_OR_FIVE), is(equalTo(NOT_MULTIPLE_OF_THREE_OR_FIVE_STRING)));
    }

    @Test
    public void shouldReturnFizzForMultiplesOfThree(){
        assertThat(fizzBuzz.run(MULTIPLE_OF_THREE), is(equalTo("fizz")));
    }

    @Test
    public void shouldReturnBuzzForMultiplesOfFive(){
        assertThat(fizzBuzz.run(MULTIPLE_OF_FIVE), is(equalTo("buzz")));
    }

    @Test
    public void shouldReturnFizzBuzzForMultiplesOfThreeAndFive(){
        assertThat(fizzBuzz.run(MULTIPLE_OF_THREE_AND_FIVE), is(equalTo("fizzbuzz")));
    }
}
