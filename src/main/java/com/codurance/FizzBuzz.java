package com.codurance;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FizzBuzz {

  public List<String> convert(int start, int end) {
    return IntStream.rangeClosed(start, end).mapToObj(this::convertIntToFizzBuzz)
        .toList();
  }

  public String convertIntToFizzBuzz(final int number) {
    BiPredicate<Integer, Integer> isDivisibleBy = (a, b)  -> a % b == 0;

    StringBuilder output = new StringBuilder();

    if (isDivisibleBy.test(number, 5) && isDivisibleBy.test(number, 3)) {
      output.append("FizzBuzz");
      return output.toString();
    } else if (isDivisibleBy.test(number, 5)) {
      output.append("Buzz");
      return output.toString();
    } else if (isDivisibleBy.test(number, 3)) {
      output.append("Fizz");
      return output.toString();
    }

    return output.append(number).toString();
  }
}
