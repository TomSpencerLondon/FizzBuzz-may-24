package com.codurance;

import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FizzBuzz {
  private static String apply(Integer a) {
    if (a % 5 == 0 && a % 3 == 0) {
      return "FizzBuzz";
    } else if (a % 5 == 0) {
      return "Buzz";
    } else if (a % 3 == 0) {
      return "Fizz";
    } else {
      return a.toString();
    }
  }

  public List<String> convert(int start, int end) {
    return IntStream.rangeClosed(start, end).mapToObj(this::convertIntToFizzBuzz)
        .toList();
  }

  public String convertIntToFizzBuzz(final int number) {
    Function<Integer, String> fizzBuzz = FizzBuzz::apply;

    return fizzBuzz.apply(number);
  }
}
