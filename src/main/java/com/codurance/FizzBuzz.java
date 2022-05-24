package com.codurance;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

  public List<String> convert(int start, int end) {
    return IntStream.rangeClosed(start, end).mapToObj(this::convertIntToFizzBuzz)
        .toList();
  }

  public String convertIntToFizzBuzz(final int number) {
    BiPredicate<Integer, Integer> isDivisibleBy = (a, b)  -> a % b == 0;

    StringBuilder output = new StringBuilder();

    if (isDivisibleBy.test(number, 5) && isDivisibleBy.test(number, 3)) {
      return result(number, "FizzBuzz", isDivisibleBy.test(number, 3) && isDivisibleBy.test(number, 5));
    } else if (isDivisibleBy.test(number, 5)) {
      return result(number, "Buzz", isDivisibleBy.test(number, 5));
    } else if (isDivisibleBy.test(number, 3)) {
      return result(number, "Fizz", isDivisibleBy.test(number, 3));
    }

    return output.append(number).toString();
  }

  private String result(int number, String result, boolean test) {
    return Stream.of(number)
        .filter(i -> test)
        .map((i) -> result).collect(Collectors.joining(""));
  }
}
