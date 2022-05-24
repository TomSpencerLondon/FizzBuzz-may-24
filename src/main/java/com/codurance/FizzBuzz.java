package com.codurance;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

  public List<String> convert(int start, int end) {
    return IntStream.rangeClosed(start, end).mapToObj(this::convertIntToFizzBuzz)
        .toList();
  }

  public String convertIntToFizzBuzz(int number) {
    boolean isDivisibleByFive = number % 5 == 0;
    boolean isDivisibleByThree = number % 3 == 0;

    StringBuilder output = new StringBuilder();

    if (isDivisibleByFive && isDivisibleByThree) {
      output.append("FizzBuzz");
      return output.toString();
    } else if (isDivisibleByFive) {
      output.append("Buzz");
      return output.toString();
    } else if (isDivisibleByThree) {
      output.append("Fizz");
      return output.toString();
    }

    return output.append(number).toString();
  }
}
