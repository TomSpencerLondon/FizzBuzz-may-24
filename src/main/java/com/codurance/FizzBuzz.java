package com.codurance;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FizzBuzz {
  private String covertToFizzBuzz(Integer a) {
    BiPredicate<Integer, Integer> divisibleBy = (num, div) -> (num % div) == 0;
    boolean divisibleByFive = divisibleBy.test(a, 5);
    boolean divisibleByThree = divisibleBy.test(a, 3);

    if (divisibleByFive && divisibleByThree) {
      return "FizzBuzz";
    } else if (divisibleByFive) {
      return "Buzz";
    } else if (divisibleByThree) {
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
