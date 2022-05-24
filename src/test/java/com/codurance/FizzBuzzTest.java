package com.codurance;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.Serializable;
import java.util.List;
import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void givenInputOfThreeReturnFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 3;

    List<String> result = fizzBuzz.convert(1, input);

    assertThat(result)
        .isEqualTo(List.of("1", "2", "Fizz"));
  }

  @Test
  public void givenInputOfFiveReturnBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 5;

    List<String> result = fizzBuzz.convert(1, input);

    List<String> expected = List.of(
        "1", "2", "Fizz", "4", "Buzz");
    assertThat(result)
        .isEqualTo(expected);
  }

  @Test
  public void givenInputOfFifteenReturnFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 15;

    List<String> result = fizzBuzz.convert(1, input);

    List<String> expected = List.of(
        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
        "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
    assertThat(result)
        .isEqualTo(expected);
  }
}
