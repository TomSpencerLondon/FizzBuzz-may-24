package com.codurance;

public class FizzBuzz {

  public String convert(int input) {
    StringBuilder result = new StringBuilder();
    if (input % 5 == 0) {
      result.append("Buzz");
    }

    if (input % 3 == 0) {
      result.insert(0, "Fizz");
    }

    if ((input % 3 != 0) && (input % 5 != 0)) {
      result.append(Integer.toString(input));
    }
    return result.toString();
  }
}
