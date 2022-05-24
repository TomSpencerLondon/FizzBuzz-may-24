package com.codurance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void givenInputOfThreeReturnFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 3;

    String result = fizzBuzz.convert(input);

    assertThat(result)
        .isEqualTo("Fizz");
  }

  @Test
  public void givenInputOfFiveReturnBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 5;

    String result = fizzBuzz.convert(input);

    assertThat(result)
        .isEqualTo("Buzz");
  }
}
