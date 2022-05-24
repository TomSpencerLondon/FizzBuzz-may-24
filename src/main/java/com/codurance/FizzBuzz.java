package com.codurance;

import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {
  private String covertToFizzBuzz(Integer a) {
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
    return IntStream.rangeClosed(start, end).mapToObj(this::covertToFizzBuzz)
        .toList();
  }

}
