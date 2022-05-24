package com.codurance;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

  public List<String> convert(int start, int end) {
    return IntStream.rangeClosed(start, end).mapToObj(this::convertIntToFizzBuzz)
        .collect(toList());
  }

  public String convertIntToFizzBuzz(int number) {
    StringBuilder output = new StringBuilder();
    if ((number % 5) == 0) {
      output.append("Buzz");
    }

    if ((number % 3) == 0) {
      output.insert(0, "Fizz");
    }

    if (number % 3 != 0 && number % 5 != 0) {
      output.append(number);
    }
    return output.toString();
  }
}
